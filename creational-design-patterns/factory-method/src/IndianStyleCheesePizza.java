/**
 * Concrete Product - Indian Style Cheese Pizza
 */
public class IndianStyleCheesePizza extends Pizza {
    public IndianStyleCheesePizza() {
        name = "Indian Style Cheese Pizza";
        dough = "Indian Style Naan Bread";
        sauce = "Spicy Tikka Masala Sauce";     
        toppings.add("Paneer Cheese");
        toppings.add("Coriander");
        toppings.add("Red Onions");
    }

    @Override
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }

}
