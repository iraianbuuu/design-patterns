package listener;
import event.EventType;

public record MobileAppListener(String username) implements Listener {

    @Override
    public void update(EventType event) {
        System.out.println("Sending mobile app notification to " + username + " regarding " + event);
    }

}
