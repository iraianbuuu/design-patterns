/**
 * Client - Main class
 */
public class Main {
    public static void main(String... args) {
        PizzaStore indianPizzaStore = new IndianPizzaStore();
        PizzaStore japanesePizzaStore = new JapanesePizzaStore();

        Pizza pizza = indianPizzaStore.orderPizza("cheese");
        System.out.println("I ordered a " + pizza.getName());

        pizza = japanesePizzaStore.orderPizza("cheese");
        System.out.println("I ordered a " + pizza.getName());
    }
}
