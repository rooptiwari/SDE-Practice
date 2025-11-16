package Software_Engineer.DesignPatterns.StrategyDesignPattern.Payent;

public class Main {
    public static void main(String[] args) {

        PaymentContext paymen = new PaymentContext(new PhonePe());
        paymen.pay(200);

        paymen.setPayment(new CreditCardPayment());
        paymen.pay(1000);

    }
}
