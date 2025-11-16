package Software_Engineer.DesignPatterns.SOLID.OCP;

public class UPIpayment implements PaymentMethod {

    public void pay(double amount) {
        System.out.println("Payment done using UPI, amount = " + amount);
    }
}
