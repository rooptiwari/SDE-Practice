package Software_Engineer.DesignPatterns.SOLID.OCP;

public class TestPayment {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();

//        PaymentMethod creditCardPayment = new CreditCardPayment();
//        paymentProcessor.processPayment(creditCardPayment, 100.0);

        PaymentMethod upiPayment = new UPIpayment();
        paymentProcessor.processPayment(upiPayment, 200.0);
    }
}
