package Software_Engineer.DesignPatterns.StrategyDesignPattern.Payent;

public class PhonePe implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Payment is Done by PhonePe : " + amount);
    }
}
