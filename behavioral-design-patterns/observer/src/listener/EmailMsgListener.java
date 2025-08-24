package listener;
import event.EventType;

public record EmailMsgListener(String email) implements Listener {
    @Override
    public void update(EventType event) {
        System.out.println("Sending mail to " + email + " regarding " + event);
    }
}
