package src.violation;
import src.EagerSingleton;
import java.lang.reflect.Constructor;

public class Reflection {
    public static void main(String... args) throws Exception {
        try{
            // Get the constructor and make it accessible
            Constructor<EagerSingleton> singletonConstructor = EagerSingleton.class.getDeclaredConstructor();
            singletonConstructor.setAccessible(true);

            // Create a new instance using reflection
            EagerSingleton instance1 = EagerSingleton.getInstance();
            EagerSingleton instance2 = singletonConstructor.newInstance();

            System.out.println("Instance 1 hash: " + instance1.hashCode());
            System.out.println("Instance 2 hash: " + instance2.hashCode());
            System.out.println((instance1 == instance2 ? "Both are same" : "Both are different!!"));
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
