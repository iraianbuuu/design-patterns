package src.violation;

import src.EagerSingleton;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;

public class Serialization {
    public static void main(String... args) {
        try{
            EagerSingleton instance1 = EagerSingleton.getInstance();
            EagerSingleton instance2 = EagerSingleton.getInstance();
            System.out.println("Instance 1 hash: " + instance1.hashCode());
            System.out.println("Instance 2 hash: " + instance2.hashCode());
            System.out.println((instance1 == instance2 ? "Both are same" : "Both are different!!"));

            // Serialization
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
            oos.writeObject(instance1);
            oos.close();

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("singleton.ser"));
            EagerSingleton instance3 = (EagerSingleton) ois.readObject();
            ois.close();

            System.out.println("Instance 3 hash: " + instance3.hashCode());
            System.out.println((instance1 == instance3 ? "Both are same" : "Both are different!!"));
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
