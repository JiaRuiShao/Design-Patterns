package creational.singleton;

public class EagerSingleton {
    // the instance will be instantiated when the program starts (class loaded)
    // the singleton instance is created irrespective of whether any other class actually asked for
    // its instance or not in an eager initialization singleton pattern, thus leads to overhead & make program runs slow
    private static final EagerSingleton instance = new EagerSingleton();

    // private constructor
    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
