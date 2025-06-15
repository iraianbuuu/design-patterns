package pizza;
import ingredients.cheese.Cheese;
import ingredients.dough.Dough;
import ingredients.sauce.Sauce;


import java.util.ArrayList;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    ArrayList<String> toppings = new ArrayList<String>();

    public abstract void prepare();

    public void setName(String name) {
        this.name = name;
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in box");
    }

    public String getName() {
        return name;
    }


}
