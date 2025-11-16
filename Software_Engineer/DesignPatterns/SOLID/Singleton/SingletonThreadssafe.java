package Software_Engineer.DesignPatterns.SOLID.Singleton;

public class SingletonThreadssafe {
    private static SingletonThreadssafe instance;

    private SingletonThreadssafe() {
        // Private constructor to prevent instantiation
    }

    public static synchronized SingletonThreadssafe getInstance() {
        if (instance == null) {
            instance = new SingletonThreadssafe();
        }
        return instance;
    }
}
