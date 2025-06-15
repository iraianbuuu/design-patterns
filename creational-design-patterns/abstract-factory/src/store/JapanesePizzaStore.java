package store;
import ingredients.factory.PizzaIngredientFactory;
import ingredients.factory.JapaneseStyleIngredientFactory;
import pizza.CheesePizza;
import pizza.Pizza;

public class JapanesePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new JapaneseStyleIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Japanese Style Cheese Pizza");
        }
        return pizza;
    }
}
