package src;
public class Main {
    public static void main(String... args) {
        /**
         * Lazy Initialization
         */
        LazySingleton instanceA = LazySingleton.getInstance();
        LazySingleton instanceB = LazySingleton.getInstance();

        System.out.println("Lazy Initialization: " + (instanceA == instanceB));

        /**
         * Eager Initialization
         */
        EagerSingleton eagerSingletonA = EagerSingleton.getInstance();
        EagerSingleton eagerSingletonB = EagerSingleton.getInstance();

        System.out.println("Eager Initialization: " + (eagerSingletonA == eagerSingletonB));

        /**
         * Static Block Initialization
         */

        StaticBlockSingleton staticBlockSingletonA = StaticBlockSingleton.getInstance();
        StaticBlockSingleton staticBlockSingletonB = StaticBlockSingleton.getInstance();

        System.out.println("Static Block Initialization: " + (staticBlockSingletonA == staticBlockSingletonB));

        /**
        * Bill Pugh Singleton
        */

        BillPughSingleton billPughSingletonA = BillPughSingleton.getInstance();
        BillPughSingleton billPughSingletonB = BillPughSingleton.getInstance();

        System.out.println("Bill Pugh Singleton: " + (billPughSingletonA == billPughSingletonB));

        /*
        * Enum Singleton
        */

        EnumSingleton enumSingletonA = EnumSingleton.INSTANCE;
        EnumSingleton enumSingletonB = EnumSingleton.INSTANCE;

        System.out.println("Enum Singleton: " + (enumSingletonA == enumSingletonB));

        /**
         * Thread Safe Singleton
         */

        MultiThreadSingleton multiThreadSingletonA = MultiThreadSingleton.getInstance();
        MultiThreadSingleton multiThreadSingletonB = MultiThreadSingleton.getInstance();
        
        MultiThreadSingleton multiThreadSingletonC = MultiThreadSingleton.getCurrentInstance();
        MultiThreadSingleton multiThreadSingletonD = MultiThreadSingleton.getCurrentInstance();

        System.out.println("Multi Thread Singleton (Synchronized): " + (multiThreadSingletonA == multiThreadSingletonB));
        System.out.println("Multi Thread Singleton (Double Checked Locking): " + (multiThreadSingletonC == multiThreadSingletonD));

    }
}