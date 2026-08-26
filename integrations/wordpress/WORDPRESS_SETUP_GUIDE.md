# WordPress Integration & Setup Guide for Shohoj SMS

This guide explains how to connect your **Shohoj SMS Android App** with your **WordPress** website using the pre-built **Shohoj SMS Receiver** plugin.

---

## 1. Download the Plugin Package

The complete, ready-to-install WordPress plugin is located in this repository:
- **Downloadable ZIP:** [`integrations/wordpress/shohoj-sms-receiver.zip`](file:///home/polash/Shohoj/Shohoj-SMS-Recovered/integrations/wordpress/shohoj-sms-receiver.zip)
- **Plugin Source:** [`integrations/wordpress/shohoj-sms-receiver/`](file:///home/polash/Shohoj/Shohoj-SMS-Recovered/integrations/wordpress/shohoj-sms-receiver/)

---

## 2. WordPress Installation Steps

1. Log in to your **WordPress Admin Dashboard** (`https://yourdomain.com/wp-admin`).
2. In the left navigation menu, go to **Plugins → Add New Plugin**.
3. Click the **Upload Plugin** button at the top of the page.
4. Choose the `shohoj-sms-receiver.zip` file and click **Install Now**.
5. After installation completes, click **Activate Plugin**.

---

## 3. Configure Secret Key & Get Endpoint URL

1. In WordPress Admin, navigate to **Settings → Shohoj SMS**.
2. **Secret Key**: Enter a secure random string (e.g. `shohoj_secret_key_8f7b3a`).
3. Click **Save Changes**.
4. Copy the **Endpoint URL** displayed on the settings screen:
   ```text
   https://yourdomain.com/wp-json/shohoj-sms/v1/receive
   ```

---

## 4. In the Shohoj SMS App (System Connect Setup)

Follow these steps inside the **Shohoj SMS** Android mobile app:

1. Open **Shohoj SMS**.
2. Tap the **Features** tab at the bottom navigation.
3. Select **System Connect** (Web Connect).
4. Tap **WordPress** → **View WordPress Setup**.
5. Enter your configuration:
   - **Site / Project Name:** Your Website Name (e.g. `My WordPress Store`)
   - **Webhook URL:** `https://yourdomain.com/wp-json/shohoj-sms/v1/receive`
   - **Secret Key / Header Token:** The exact Secret Key configured in WordPress Settings (`X-Shohoj-Secret`).
   - **Auto-Approve / Forwarding Rules:** Enable auto-forwarding for financial providers (bKash, Nagad, Rocket, Upay, etc.).
6. Tap **Save & Connect**.

---

## 5. Handling Received SMS in WordPress (Developer Action Hook)

Whenever an incoming SMS matches your forwarding rules, Shohoj SMS sends a JSON POST request to your WordPress site.

The plugin verifies the `X-Shohoj-Secret` header and fires the `shohoj_sms_received` action hook.

Add your custom processing logic to your theme's `functions.php` or a custom mu-plugin:

```php
add_action( 'shohoj_sms_received', 'process_shohoj_sms_payment' );

function process_shohoj_sms_payment( $data ) {
    $sender_number   = $data['sender_number'];   // e.g. 16216 (bKash), 16167 (Nagad)
    $customer_number = $data['customer_number']; // Customer's phone number
    $amount          = $data['amount'];          // Amount received (e.g. "500.00")
    $trx_id          = $data['trx_id'];          // Transaction ID (e.g. "BKA12345678")
    $reference       = $data['reference'];       // Order reference or user ID
    $raw_message     = $data['raw_message'];     // Full raw SMS text
    $timestamp       = $data['timestamp'];       // Timestamp from device

    // -------------------------------------------------------------
    // Example: Auto-verify WooCommerce order matching Transaction ID
    // -------------------------------------------------------------
    if ( function_exists( 'wc_get_orders' ) && ! empty( $trx_id ) ) {
        // Query orders with matching transaction ID in meta
        $orders = wc_get_orders( array(
            'meta_key'     => '_transaction_id',
            'meta_value'   => $trx_id,
            'status'       => array( 'pending', 'on-hold' ),
            'limit'        => 1,
        ) );

        if ( ! empty( $orders ) ) {
            $order = $orders[0];
            $order->payment_complete( $trx_id );
            $order->add_order_note( sprintf(
                __( 'Shohoj SMS: Payment of %s confirmed via %s (TrxID: %s)', 'shohoj-sms' ),
                $amount,
                $sender_number,
                $trx_id
            ) );
        }
    }
}
```

---

## 6. Verifying & Troubleshooting

1. **Test Payload Inspection:** In WordPress Admin, visit **Settings → Shohoj SMS**. Under **Last Received SMS**, you will see the exact JSON data payload received from your Android phone.
2. **HTTP 401 Unauthorized:** If you see 401 errors, double check that the secret key configured in the app matches the secret key in WordPress settings.
3. **SSL / HTTPS Required:** Ensure your WordPress website uses valid HTTPS, as Android network security config blocks unencrypted HTTP traffic by default.
