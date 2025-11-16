package Software_Engineer.LLD.AlertSystem;

public class AlertService {
    private static AlertService instance = null;
    private AlertPublisher publisher;

    private AlertService() {
        publisher = new AlertPublisher();
    }

    public static AlertService getInstance() {
        if (instance == null) instance = new AlertService();
        return instance;
    }

    public void registerChannel(NotificationChannel channel) {
        publisher.subscribe(channel);
    }

    public void triggerAlert(AlertType type, String message) {
        System.out.println("ALERT TRIGGERED: " + type);
        AlertEvent event = new AlertEvent(type, message);
        publisher.publish(event);
    }
}

