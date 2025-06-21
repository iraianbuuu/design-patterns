import java.util.List;
import java.util.ArrayList;

public class ZomatoInventory {
    private List<Item> products;

    public ZomatoInventory() {
        this.products = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.products.add(item);
    }

    public void removeItem(Item item) {
        this.products.remove(item);
    }
}
