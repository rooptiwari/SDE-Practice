package Software_Engineer.DesignPatterns.SOLID.Singleton;

public class DoubleCheckSingleton {
    private static volatile DoubleCheckSingleton instance;

    private DoubleCheckSingleton() {
        // Private constructor to prevent instantiation
    }

    public static DoubleCheckSingleton getInstance() {
        if (instance == null) { // First check (no locking)
            synchronized (DoubleCheckSingleton.class) {
                if (instance == null) { // Second check (with locking)
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
