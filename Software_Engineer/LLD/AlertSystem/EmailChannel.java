package Software_Engineer.LLD.AlertSystem;

public class EmailChannel implements NotificationChannel {
    private String email;

    public EmailChannel(String email) {
        this.email = email;
    }

    @Override
    public void send(String message) {
        System.out.println("Email to " + email + ": " + message);
    }
}

