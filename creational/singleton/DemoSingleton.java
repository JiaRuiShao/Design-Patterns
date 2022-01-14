package creational.singleton;

import java.io.Serial;
import java.io.Serializable;

public class DemoSingleton implements Serializable {

    // A changed class structure will cause the JVM to give an exception in the de-serializing process.
    // The problem can be solved by adding a unique serial version id to the class. It will prevent the compiler from throwing the exception by telling it that both classes are same, and will load the available instance variables only.
    // private static inner class, created only when called
    @Serial
    private static final long serialVersionUID = 1L;

    private DemoSingleton() {
        // private constructor
    }

    private static class DemoSingletonHolder {
        public static final DemoSingleton INSTANCE = new DemoSingleton();

    }

    public static DemoSingleton getInstance() {
        return DemoSingletonHolder.INSTANCE;
    }

    // This method will be invoked when we de-serialize the object.
    // Inside this method, we return the existing instance to ensure a single instance application wide.
    @Serial
    protected Object readResolve() {
        return getInstance();
    }
}