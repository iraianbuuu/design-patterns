import java.util.HashMap;
import java.util.Map;

public class VehicleRegistry {
    private static Map<String, Vehicle> vehicles = new HashMap<>();

    /**
     * Initialize with some prototype vehicles
     */
    static {
        System.out.println("Initializing Vehicle Registry...");
        vehicles.put("Koenigsegg", new Car("V8", "Koenigsegg", "", "Red", 2023, 1160, 8));
        vehicles.put("BMW", new Car("V6", "BMW", "M3", "Blue", 2023, 473, 6));
        vehicles.put("Mercedes", new Bus("Diesel", "Mercedes", "Sprinter", "White", 2023, 4));
        vehicles.put("Volvo", new Bus("Electric", "Volvo", "BZR", "Green", 2023, 3));
        System.out.println();
    }

    /**
     * Get a vehicle by name
     * 
     * @param name Name of the vehicle
     * @return Vehicle
     */
    public static Vehicle getVehicle(String name) {
        return vehicles.get(name).clone();
    }

    /**
     * Add a new vehicle to the registry
     * 
     * @param name    Name of the vehicle
     * @param vehicle Vehicle to add
     */
    public static void addVehicle(String name, Vehicle vehicle) {
        vehicles.put(name, vehicle);
    }

}
