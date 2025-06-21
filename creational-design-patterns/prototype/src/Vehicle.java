public abstract class Vehicle {
    private String engine;
    private String brand;
    private String model;
    private String color;
    private int year;

    public Vehicle(String engine, String brand, String model, String color, int year) {
        this.engine = engine;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    protected Vehicle(Vehicle vehicle) {
        this.engine = vehicle.engine;
        this.brand = vehicle.brand;
        this.model = vehicle.model;
        this.color = vehicle.color;
        this.year = vehicle.year;
    }
    
    public abstract Vehicle clone();
}
