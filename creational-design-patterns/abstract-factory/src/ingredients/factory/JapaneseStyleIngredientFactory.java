package ingredients.factory;
import ingredients.cheese.Cheese;
import ingredients.dough.Dough;
import ingredients.sauce.Sauce;
import ingredients.dough.MochiDough;
import ingredients.sauce.SoySauce;
import ingredients.cheese.ParmesanCheese;

public class JapaneseStyleIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new MochiDough();
    }

    @Override
    public Sauce createSauce() {
        return new SoySauce();
    }

    @Override
    public Cheese createCheese() {
        return new ParmesanCheese();
    }
}
