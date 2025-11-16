package Software_Engineer.DesignPatterns.StrategyDesignPattern.Payent;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Payment Done by CreaditCard : " + amount);
    }
}
