package Software_Engineer.DesignPatterns.StrategyDesignPattern.Vechile;

public class Vehicle {

    DriveingStratagy obj ;
    StartStrategy obj1;
    public Vehicle( DriveingStratagy obj , StartStrategy obj1){
        this.obj = obj;
        this.obj1 = obj1;
    }
    void drive(){
        obj.drive();
    }
    void start(){
        obj1.start();
    }
}
