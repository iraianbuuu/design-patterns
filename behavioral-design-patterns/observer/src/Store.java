import event.EventType;

public class Store {
    private final NotificationService notificationService;

    public Store() {
        this.notificationService = new NotificationService();
    }

    public void newItemPromotion() {
        notificationService.notifyCustomers(EventType.NEW_ITEM);
    }

    public void salePromotion() {
        notificationService.notifyCustomers(EventType.SALE);
    }

    public NotificationService getService() {
        return notificationService;
    }

}
