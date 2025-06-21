public class Main {
    public static void main(String... args) {

        Vehicle koenigsegg = VehicleRegistry.getVehicle("Koenigsegg");
        System.out.println(koenigsegg);
        System.out.println();

        System.out.println("Deep Copy Example");
        Car originalCar = new Car("V8", "Ferrari", "F40", "Red", 1990, 471, 8);

        // Modify the engine in deep copy
        Car deepCopy = originalCar.clone();
        deepCopy.getEngine().setType("V12");
        deepCopy.getEngine().setCylinders(12);
        System.out.println("Engine objects are same: " + (originalCar.getEngine().equals(deepCopy.getEngine())));
        System.out.println();

        System.out.println("Shallow Copy Example");
        // Modify the engine in shallow copy
        Car shallowCopy = originalCar.shallowClone();
        shallowCopy.getEngine().setType("V6");
        shallowCopy.getEngine().setCylinders(6);
        System.out.println("Engine objects are same: " + (originalCar.getEngine().equals(shallowCopy.getEngine())));
        System.out.println();

    }
}
