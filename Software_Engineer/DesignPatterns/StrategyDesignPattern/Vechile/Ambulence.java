package Software_Engineer.DesignPatterns.StrategyDesignPattern.Vechile;

public class Ambulence extends Vehicle{
    public Ambulence(DriveingStratagy obj, StartStrategy obj1) {
        super(obj, obj1);
    }
}
