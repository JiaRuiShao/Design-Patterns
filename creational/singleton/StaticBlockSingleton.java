package creational.singleton;

public class StaticBlockSingleton {
    private static final StaticBlockSingleton INSTANCE;

    // static blocks are executed during the loading of a class, even before the constructor is called
    static {
        try {
            INSTANCE = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Uffff, i was not expecting this!", e);
        }
    }

    public static StaticBlockSingleton getInstance() {
        return INSTANCE;
    }

    private StaticBlockSingleton() {
        // ...
    }
}
