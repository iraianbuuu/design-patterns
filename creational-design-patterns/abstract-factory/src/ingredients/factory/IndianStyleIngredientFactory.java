package ingredients.factory;
import ingredients.cheese.Cheese;
import ingredients.dough.Dough;
import ingredients.sauce.Sauce;
import ingredients.dough.NaanDough;
import ingredients.sauce.TikkaMasalaSauce;
import ingredients.cheese.MozzarellaCheese;

public class IndianStyleIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new NaanDough();
    }

    @Override
    public Sauce createSauce() {
        return new TikkaMasalaSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }
}
