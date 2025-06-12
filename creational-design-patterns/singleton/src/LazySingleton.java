package src;

/**
 * It will works in single threaded environment
 * but when it comes to multi-threaded environment
 * both threads will get different instances of the
 * singleton class
 */
public class LazySingleton {

    private static LazySingleton instance = null;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        return instance == null ? instance = new LazySingleton() : instance;
    }
}