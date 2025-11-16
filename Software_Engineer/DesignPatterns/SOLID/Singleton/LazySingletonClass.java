package Software_Engineer.DesignPatterns.SOLID.Singleton;

public class LazySingletonClass {
    private static LazySingletonClass instance;

    private LazySingletonClass() {
        // Private constructor to prevent instantiation
    }
    public static LazySingletonClass getInstance(){
        if(instance == null){
            instance = new LazySingletonClass();
        }
        return instance;
    }
}
