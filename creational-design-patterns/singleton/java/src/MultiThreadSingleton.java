package src;
/**
 * Best for Multi threaded environment for not violating singleton
 * pattern. 
 */
public class MultiThreadSingleton {
    private static MultiThreadSingleton instance = null;
    private static volatile MultiThreadSingleton INSTANCE = null;
    private static final Object mutex = new Object();
    private MultiThreadSingleton() {}

    /**
     * The program execute properly but this leads to
     * slow performance because of locking overhead.
     */
    public static synchronized MultiThreadSingleton getInstance() {
        return instance == null ? instance = new MultiThreadSingleton() : instance;
    }

    /**
     * This is the best way to create a singleton in a
     * multi-threaded environment. It is thread safe and
     * has better performance than the synchronized method.
     * The approach is called double-checked locking (DCL). It exists
     * because the first check (result == null) is to avoid locking
     * if the instance is already created. The second check (INSTANCE == null)
     * is to avoid multiple threads creating the instance at the same time.
     */
    public static MultiThreadSingleton getCurrentInstance(){
        MultiThreadSingleton result = INSTANCE;
        if(result == null){
            synchronized(mutex){
                result = INSTANCE == null ? INSTANCE = new MultiThreadSingleton() : INSTANCE;
            }
        }
        return result;
    }
}
