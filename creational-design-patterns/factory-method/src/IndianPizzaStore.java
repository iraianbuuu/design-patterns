/**
 * Concrete Creator - Indian Pizza Store
 */
public class IndianPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new IndianStyleCheesePizza();
        } else {
            throw new IllegalArgumentException("Invalid pizza type: " + type);
        }
    }
}