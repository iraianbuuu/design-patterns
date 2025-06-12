package src.violation;

import src.LazySingleton;

public class MultiThread {
    public static void main(String... args) {
        for(int i = 0; i < 10; i++){
            new Thread(() -> {
                LazySingleton instance = LazySingleton.getInstance();
                System.out.println(instance.hashCode());
            }).start();
        }
    }
}
