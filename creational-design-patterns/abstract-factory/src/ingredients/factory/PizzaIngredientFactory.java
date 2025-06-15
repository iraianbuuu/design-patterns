package ingredients.factory;
import ingredients.cheese.Cheese;
import ingredients.dough.Dough;
import ingredients.sauce.Sauce;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
}
