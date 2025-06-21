public class GroceryItem {
    private String groceryName;
    private double groceryPrice;
    private String shopName;

    public GroceryItem(String groceryName, double groceryPrice, String shopName) {
        this.groceryName = groceryName;
        this.groceryPrice = groceryPrice;
        this.shopName = shopName;
    }

    public String getGroceryName() {
        return groceryName;
    }

    public double getGroceryPrice() {
        return groceryPrice;
    }

    public String getShopName() {
        return shopName;
    }

}
