public class Main {
    public static void main(String... args) {
        ZomatoInventory zomato = new ZomatoInventory();

        FoodItem masalaDosa = new FoodItem("Masala Dosa", 130, "Rameshwaram Cafe");

        FoodItem buttonIdlis = new FoodItem("Button Idlis", 80, "Rameshwaram Cafe");

        zomato.addItem(masalaDosa);
        zomato.addItem(buttonIdlis);

        GroceryItem potatoes = new GroceryItem("Potatoes", 100, "Shopwell Mart");

        // zomato.addItem(potatoes); // Throws an error

        zomato.addItem(new GroceryItemAdapter(potatoes));
    }
}
