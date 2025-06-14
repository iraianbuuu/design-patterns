/**
 * Concrete Product - Japanese Style Cheese Pizza
 */
public class JapaneseStyleCheesePizza extends Pizza {
    public JapaneseStyleCheesePizza() {
        name = "Japanese Style Cheese Pizza";
        dough = "Japanese Style Mochi Bread";
        cheese = "Parmesan Cheese";
        sauce = "Japanese Style Soy Sauce";     
        toppings.add("Japanese Cheese");
        toppings.add("Japanese Onions");
        toppings.add("Japanese Coriander");
    }

    @Override
    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

}
