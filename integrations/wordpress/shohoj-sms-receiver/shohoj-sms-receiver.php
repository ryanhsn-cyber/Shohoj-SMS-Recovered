<?php
/**
 * Plugin Name: Shohoj SMS Receiver
 * Description: A secure WordPress plugin to receive and process SMS data from the Shohoj SMS Android app.
 * Version: 1.0.0
 * Author: Shohoj SMS
 * License: GPL-2.0-or-later
 * Text Domain: shohoj-sms
 */

if ( ! defined( 'ABSPATH' ) ) {
	exit; // Exit if accessed directly.
}

/**
 * Main Class for Shohoj SMS Receiver
 */
class Shohoj_SMS_Receiver {

	const OPTION_NAME        = 'shohoj_sms_settings';
	const LAST_PAYLOAD_NAME  = 'shohoj_sms_last_payload';
	const SECRET_HEADER_KEY  = 'X-Shohoj-Secret';
	const API_NAMESPACE      = 'shohoj-sms/v1';

	public function __construct() {
		add_action( 'rest_api_init', array( $this, 'register_rest_route' ) );
		add_action( 'admin_menu', array( $this, 'add_settings_page' ) );
		add_action( 'admin_init', array( $this, 'register_settings' ) );
	}

	/**
	 * Register the REST API route.
	 */
	public function register_rest_route() {
		register_rest_route( self::API_NAMESPACE, '/receive', array(
			'methods'             => 'POST',
			'callback'            => array( $this, 'handle_sms_receive' ),
			'permission_callback' => array( $this, 'validate_secret_header' ),
		) );
	}

	/**
	 * Validate the secret header before processing the request.
	 */
	public function validate_secret_header( $request ) {
		$provided_secret = $request->get_header( strtolower( self::SECRET_HEADER_KEY ) );
		$stored_settings = get_option( self::OPTION_NAME );
		$stored_secret   = isset( $stored_settings['secret_key'] ) ? $stored_settings['secret_key'] : '';

		if ( empty( $stored_secret ) ) {
			return new WP_Error( 'config_error', __( 'Secret key is not configured in settings.', 'shohoj-sms' ), array( 'status' => 500 ) );
		}

		if ( $provided_secret !== $stored_secret ) {
			return new WP_Error( 'unauthorized', __( 'Invalid Secret Key.', 'shohoj-sms' ), array( 'status' => 401 ) );
		}

		return true;
	}

	/**
	 * Handle the incoming SMS payload.
	 */
	public function handle_sms_receive( $request ) {
		$params = $request->get_json_params();

		if ( empty( $params ) ) {
			return new WP_REST_Response( array( 'success' => false, 'message' => 'Empty payload.' ), 400 );
		}

		// Sanitize and extract data based on the TransactionEntity in the Android app
		$data = array(
			'sender_number'   => sanitize_text_field( isset( $params['sender_number'] ) ? $params['sender_number'] : '' ),
			'customer_number' => sanitize_text_field( isset( $params['customer_number'] ) ? $params['customer_number'] : '' ),
			'amount'          => sanitize_text_field( isset( $params['amount'] ) ? $params['amount'] : '' ),
			'trx_id'          => sanitize_text_field( isset( $params['trx_id'] ) ? $params['trx_id'] : '' ),
			'reference'       => sanitize_text_field( isset( $params['reference'] ) ? $params['reference'] : '' ),
			'raw_message'     => sanitize_textarea_field( isset( $params['raw_message'] ) ? $params['raw_message'] : '' ),
			'timestamp'       => sanitize_text_field( isset( $params['timestamp'] ) ? $params['timestamp'] : '' ),
			'received_at'     => current_time( 'mysql' ),
		);

		// Store the last payload for display in admin
		update_option( self::LAST_PAYLOAD_NAME, $data );

		/**
		 * Action hook to allow other plugins or themes to process this data.
		 * Use this hook to add custom logic like updating user balances.
		 */
		do_action( 'shohoj_sms_received', $data );

		return new WP_REST_Response( array(
			'success' => true,
			'message' => 'SMS data received.',
			'trx_id'  => $data['trx_id']
		), 200 );
	}

	public function add_settings_page() {
		add_options_page(
			__( 'Shohoj SMS Settings', 'shohoj-sms' ),
			__( 'Shohoj SMS', 'shohoj-sms' ),
			'manage_options',
			'shohoj-sms-settings',
			array( $this, 'render_settings_page' )
		);
	}

	public function register_settings() {
		register_setting( self::OPTION_NAME, self::OPTION_NAME );

		add_settings_section( 'shohoj_sms_main', __( 'API Configuration', 'shohoj-sms' ), null, 'shohoj-sms-settings' );

		add_settings_field( 'secret_key', __( 'Secret Key', 'shohoj-sms' ), array( $this, 'render_secret_key_field' ), 'shohoj-sms-settings', 'shohoj_sms_main' );
	}

	public function render_secret_key_field() {
		$options = get_option( self::OPTION_NAME );
		$val = isset( $options['secret_key'] ) ? esc_attr( $options['secret_key'] ) : '';
		echo '<input type="password" name="' . esc_attr( self::OPTION_NAME ) . '[secret_key]" value="' . $val . '" class="regular-text">';
	}

	public function render_settings_page() {
		?>
		<div class="wrap">
			<h1><?php echo esc_html( get_admin_page_title() ); ?></h1>
			<form method="post" action="options.php">
				<?php
				settings_fields( self::OPTION_NAME );
				do_settings_sections( 'shohoj-sms-settings' );
				submit_button();
				?>
			</form>

			<hr>

			<h2><?php esc_html_e( 'Endpoint Details', 'shohoj-sms' ); ?></h2>
			<p>Enter this URL in your Android App's Webhook settings:</p>
			<p>URL: <code><?php echo esc_url( rest_url( self::API_NAMESPACE . '/receive' ) ); ?></code></p>

			<hr>

			<h2><?php esc_html_e( 'Last Received SMS', 'shohoj-sms' ); ?></h2>
			<?php
			$last = get_option( self::LAST_PAYLOAD_NAME );
			if ( $last ) {
				echo '<pre style="background:#eee; padding:15px; border:1px solid #ccc;">' . esc_html( print_r( $last, true ) ) . '</pre>';
			} else {
				echo '<p>No data received yet. Send a test from the app!</p>';
			}
			?>
		</div>
		<?php
	}
}

new Shohoj_SMS_Receiver();
