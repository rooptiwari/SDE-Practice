package Software_Engineer.LLD.AlertSystem;

public class Main {
    public static void main(String[] args) {
        AlertService alertService = AlertService.getInstance();

        // Registering notification channels
        NotificationChannel email = NotificationFactory.create("EMAIL", "admin@example.com");
        NotificationChannel sms = NotificationFactory.create("SMS", "9876543210");

        alertService.registerChannel(email);
        alertService.registerChannel(sms);

        // Trigger an alert
        alertService.triggerAlert(AlertType.SERVER_DOWN, "Production Server is DOWN!");
    }
}

