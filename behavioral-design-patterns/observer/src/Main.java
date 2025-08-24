import event.EventType;
import listener.EmailMsgListener;
import listener.MobileAppListener;

public class Main {
    public static void main(String[] args) {
        Store zudio = new Store();
        zudio.getService().subscribe(
                EventType.NEW_ITEM,
                new EmailMsgListener("iraianbu1@gmail.com"));
        zudio.getService().subscribe(
                EventType.SALE,
                new MobileAppListener("iraianbu1@gmail.com"));
        zudio.getService().subscribe(
                EventType.SALE,
                new EmailMsgListener("iraianbu2@gmail.com"));

        // zudio.newItemPromotion();
        zudio.salePromotion();
        zudio.getService().unsubscribe(EventType.SALE, 
          new EmailMsgListener("iraianbu2@gmail.com")
        );
        zudio.salePromotion();
    }
}
