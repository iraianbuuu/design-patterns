/**
 * Creator - Abstract PizzaStore class
 */
public abstract class PizzaStore {
    
    /**
     * The orderPizza method doesn't know which concrete Pizza class it will be
     * creating. It doesn't matter which class it is, because the Pizza class
     * has a method that all Pizzas can use.
     */
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    
    /**
     * All PizzaStore subclasses must implement this method to create the
     * appropriate Pizza object.
     */
    abstract Pizza createPizza(String type);
}
