public class Engine {
    private String type;
    private int cylinders;

    public Engine(String type, int cylinders) {
        this.type = type;
        this.cylinders = cylinders;
    }

    // Copy constructor for deep copy
    public Engine(Engine engine) {
        this.type = engine.type;
        this.cylinders = engine.cylinders;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }
}