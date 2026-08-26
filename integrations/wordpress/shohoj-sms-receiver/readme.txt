=== Shohoj SMS Receiver ===
Contributors: shohojsms
Donate link: https://example.com/
Tags: sms, gateway, webhook, bkash, nagad, rocket
Requires at least: 5.6
Tested up to: 6.7
Stable tag: 1.0.0
Requires PHP: 7.4
License: GPLv2 or later
License URI: https://www.gnu.org/licenses/gpl-2.0.html

A secure WordPress plugin to receive and process SMS data forwarded from the Shohoj SMS Android app.

== Description ==

Shohoj SMS Receiver provides a dedicated REST API webhook endpoint for WordPress websites to receive transaction and notification SMS data from the Shohoj SMS Android app.

Key Features:
* Secure webhook endpoint protected by customizable Secret Key (`X-Shohoj-Secret` header).
* Sanitizes and parses sender numbers, customer numbers, transaction IDs, amounts, and reference codes.
* Provides developer action hooks (`shohoj_sms_received`) for easy integration with WooCommerce or custom wallet systems.
* Easy-to-use WordPress admin settings page to view endpoint URL and inspect the last received payload.

== Installation ==

1. Upload `shohoj-sms-receiver.zip` via WordPress Admin (Plugins > Add New > Upload Plugin).
2. Activate the plugin through the 'Plugins' menu in WordPress.
3. Go to **Settings > Shohoj SMS** and set your Secret Key.
4. Copy the Webhook URL and enter it in the Shohoj SMS Android app alongside your Secret Key.

== Changelog ==

= 1.0.0 =
* Initial release with REST API webhook receiver and admin settings screen.
