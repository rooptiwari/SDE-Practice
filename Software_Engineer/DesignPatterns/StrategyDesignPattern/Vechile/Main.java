package Software_Engineer.DesignPatterns.StrategyDesignPattern.Vechile;

public class Main {
static Vehicle sportcar = new spotCar();
static Vehicle normalCar = new normalCar();

    public static void main(String[] args) {
        System.out.println("You are driveing Sport car");
        sportcar.start();
        sportcar.drive();

        System.out.println("============");

        System.out.println("You are driving normal car");
        normalCar.start();
        normalCar.drive();

        System.out.println("============");

        System.out.println("You are driving Ambulance");
        Vehicle ambulence = new Ambulence(new normalDriving(), new PushButtonStart());
        ambulence.start();
        ambulence.drive();
    }
}
