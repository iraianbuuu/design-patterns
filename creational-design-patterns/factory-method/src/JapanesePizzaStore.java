/**
 * Concrete Creator - Japanese Pizza Store
 */
public class JapanesePizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new JapaneseStyleCheesePizza();
        } else {
            throw new IllegalArgumentException("Invalid pizza type: " + type);
        }
    }
}
