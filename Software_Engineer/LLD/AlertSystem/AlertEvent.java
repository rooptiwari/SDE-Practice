package Software_Engineer.LLD.AlertSystem;

public class AlertEvent {
    private AlertType type;
    private String message;

    public AlertEvent(AlertType type, String message) {
        this.type = type;
        this.message = message;
    }

    public AlertType getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }
}

