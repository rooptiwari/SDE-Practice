package Software_Engineer.LLD.AlertSystem;

public class SMSChannel implements NotificationChannel {
    private String phone;

    public SMSChannel(String phone) {
        this.phone = phone;
    }

    @Override
    public void send(String message) {
        System.out.println("SMS to " + phone + ": " + message);
    }
}

