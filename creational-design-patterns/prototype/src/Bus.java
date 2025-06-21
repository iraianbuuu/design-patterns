public class Bus extends Vehicle {
    private int doors;

    public Bus(String engine, String brand, String model, String color, int year, int doors) {
        super(engine, brand, model, color, year);
        System.out.println("Creating using default constructor - Bus");
        this.doors = doors;
    }

    public Bus(Bus bus) {
        super(bus);
        System.out.println("Creating using copy constructor - Bus");
        this.doors = bus.doors;
    }

    @Override
    public Bus clone() {
        return new Bus(this);
    }
}
