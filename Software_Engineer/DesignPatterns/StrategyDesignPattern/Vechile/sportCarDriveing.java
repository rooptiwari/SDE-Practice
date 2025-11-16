package Software_Engineer.DesignPatterns.StrategyDesignPattern.Vechile;

public class sportCarDriveing implements DriveingStratagy{
    @Override
    public void drive() {
        System.out.println("Driving speed is FAST");
    }
}
