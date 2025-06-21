public class FoodItem implements Item {

    private String foodName;
    private double price;
    private String restaurantName;

    public FoodItem(String foodName, double price, String restaurantName) {
        this.foodName = foodName;
        this.price = price;
        this.restaurantName = restaurantName;
    }

    @Override
    public String getItemName() {
        return foodName;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getRestaurantName() {
        return restaurantName;
    }

}
