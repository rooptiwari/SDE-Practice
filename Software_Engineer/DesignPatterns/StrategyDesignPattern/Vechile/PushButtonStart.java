package Software_Engineer.DesignPatterns.StrategyDesignPattern.Vechile;

public class PushButtonStart implements StartStrategy{
    @Override
    public void start() {
        System.out.println("Push Button Start");
    }
}
