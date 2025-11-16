package Software_Engineer.DesignPatterns.StrategyDesignPattern.Vechile;

public class manualStart implements StartStrategy{
    @Override
    public void start() {
        System.out.println("Please start with the car key");
    }
}
