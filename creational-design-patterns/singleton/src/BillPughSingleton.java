package src;
/**
 *  This approach is used prior to Java 5. 
 *  When the singleton class is loaded, SingletonHelper
 *  class is not loaded in the memory. The class gets loaded when
 *  the getInstance method is called. 
 */
public class BillPughSingleton {
    private BillPughSingleton() {}

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

}
