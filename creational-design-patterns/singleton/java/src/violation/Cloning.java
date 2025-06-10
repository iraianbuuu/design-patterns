package src.violation;

import src.EagerSingleton;

public class Cloning {
    public static void main(String... args) {
        try {
            EagerSingleton instance1 = EagerSingleton.getInstance();
            EagerSingleton instance2 = EagerSingleton.getInstance();
            System.out.println("Instance 1 hash: " + instance1.hashCode());
            System.out.println("Instance 2 hash: " + instance1.hashCode());
            System.out.println((instance1 == instance2 ? "Both are same" : "Both are different!!"));

            // Cloning the instance
            EagerSingleton instance3 = (EagerSingleton) instance1.clone();
            System.out.println("Instance 3 hash: " + instance3.hashCode());
            System.out.println((instance1 == instance3 ? "Both are same" : "Both are different!!"));
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}