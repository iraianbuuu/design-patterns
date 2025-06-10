package src;

import java.io.Serializable;

/**
 * If the singleton class not using a lot of resource, we can go
 * for Eager Singleton. There is no options for exception
 * handling. Good for single threaded environment.
 */
public class EagerSingleton implements Cloneable , Serializable {
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
        /**
         * This is to prevent the class from being instantiated
         * using reflection.
         */
        if(instance != null){
            throw new RuntimeException("Use getInstance() method to get the instance");
        }

    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        /*
         * This is to prevent the class from being cloned
         * using the clone() method.
         */
        if(instance != null){
            throw new CloneNotSupportedException("Use getInstance() method to get the instance");
        }
        return super.clone();
    }

    /**
     * This is to prevent the class from being deserialized
     * using the readObject() method.
     */
    private Object readResolve() {
        return instance;
    }

    public static EagerSingleton getInstance(){ 
        return instance;
    }
}