package Software_Engineer.LLD.AlertSystem;

public class NotificationFactory {
    public static NotificationChannel create(String type, String target) {
        switch(type.toUpperCase()) {
            case "EMAIL": return new EmailChannel(target);
            case "SMS": return new SMSChannel(target);
            default: throw new IllegalArgumentException("Invalid channel type");
        }
    }
}
