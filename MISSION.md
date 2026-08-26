# MISSION.md — Shohoj SMS System

## 1. Core Goal
Shohoj SMS is an automated SMS gateway & transaction forwarding ecosystem. It captures financial / transaction SMS messages on Android devices (e.g., bKash, Nagad, Rocket) and securely forwards parsed transaction data to external endpoints, including WordPress websites for automated payment verification, balance updates, and notifications.

## 2. Current Status
- Decompiled Android client structure and models inspected (`ProjectEntity`, `ConnectedSiteEntity`, `RuleEntity`, `TransactionEntity`).
- WordPress receiver plugin created at `integrations/wordpress/shohoj-sms-receiver.php`.
- REST API endpoint registered (`/wp-json/shohoj-sms/v1/receive`) with secret header validation (`X-Shohoj-Secret`).

## 3. Goal Pivots
- **WordPress Integration Layer:** Added a standalone WordPress plugin to allow easy plug-and-play webhook reception from the Shohoj SMS mobile app.

## 4. Production Roadmap
1. Install & activate `shohoj-sms-receiver.php` inside the target WordPress `wp-content/plugins/` directory.
2. Configure the secret key in WordPress admin (**Settings > Shohoj SMS**).
3. In the Shohoj SMS Android app, configure the webhook endpoint URL and header token (`X-Shohoj-Secret`).
4. Hook WordPress business logic into `shohoj_sms_received` action for custom processing (WooCommerce order status update, wallet balance, etc.).
