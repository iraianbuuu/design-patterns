import java.util.Map;

import event.EventType;
import listener.Listener;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class NotificationService {
    private final Map<EventType, List<Listener>> customers;

    public NotificationService() {
        customers = new HashMap<>();
        Arrays.stream(
            EventType.values()
        ).forEach(
            event -> customers.put(event, new ArrayList<>())
        );
    }

    public void subscribe(EventType event, Listener listener) {
        customers.get(event).add(listener);
    }

    public void unsubscribe(EventType event, Listener listener) {
        customers.get(event).remove(listener);
    }

    public void notifyCustomers(EventType event) {
        customers.get(event).forEach(
                listener -> listener.update(event));
    }
}
