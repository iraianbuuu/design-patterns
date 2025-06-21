public class GroceryItemAdapter implements Item {
    private GroceryItem groceryItem;

    public GroceryItemAdapter(GroceryItem groceryItem) {
        this.groceryItem = groceryItem;
    }

    @Override
    public String getItemName() {
        return groceryItem.getGroceryName();
    }

    @Override
    public double getPrice() {
        return groceryItem.getGroceryPrice();
    }

    @Override
    public String getRestaurantName() {
        return groceryItem.getShopName();
    }
}
