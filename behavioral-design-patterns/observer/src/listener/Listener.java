package listener;
import event.EventType;

public interface Listener {
    void update(EventType event);
}
