public class Car extends Vehicle {
    private int horsePower;
    private Engine engine; // Mutable object reference

    public Car(String engineType, String brand, String model, String color, int year,
            int horsePower, int cylinders) {
        super(engineType, brand, model, color, year);
        System.out.println("Creating using default constructor - Car");
        this.horsePower = horsePower;
        this.engine = new Engine(engineType, cylinders);
    }

    // Deep copy constructor
    public Car(Car car) {
        super(car);
        System.out.println("Creating using deep copy constructor - Car");
        this.horsePower = car.horsePower;
        // Deep copy: create new Engine object
        this.engine = new Engine(car.engine);
    }

    // Shallow copy constructor
    public Car(Car car, boolean shallow) {
        super(car);
        System.out.println("Creating using shallow copy constructor - Car");
        this.horsePower = car.horsePower;
        // Shallow copy: share the same Engine reference
        if (shallow) this.engine = car.engine;
    }

    @Override
    public Car clone() {
        // Deep copy - creates completely new object with new Engine
        return new Car(this);
    }

    public Car shallowClone() {
        // Shallow copy - creates new object but shares Engine reference
        return new Car(this, true);
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

}
