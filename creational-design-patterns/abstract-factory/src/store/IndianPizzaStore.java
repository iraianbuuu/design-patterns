package store;
import ingredients.factory.IndianStyleIngredientFactory;
import ingredients.factory.PizzaIngredientFactory;
import pizza.CheesePizza;
import pizza.Pizza;
 

public class IndianPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new IndianStyleIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Indian Style Cheese Pizza");
        }
        return pizza;
    }
}
