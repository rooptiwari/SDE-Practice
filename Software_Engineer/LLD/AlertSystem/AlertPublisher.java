package Software_Engineer.LLD.AlertSystem;

import java.util.ArrayList;
import java.util.List;

public class AlertPublisher {
    private List<NotificationChannel> subscribers = new ArrayList<>();

    public void subscribe(NotificationChannel channel) {
        subscribers.add(channel);
    }

    public void unsubscribe(NotificationChannel channel) {
        subscribers.remove(channel);
    }

    public void publish(AlertEvent event) {
        for (NotificationChannel channel : subscribers) {
            channel.send(event.getMessage());
        }
    }
}

