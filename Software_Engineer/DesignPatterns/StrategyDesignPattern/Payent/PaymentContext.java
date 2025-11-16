package Software_Engineer.DesignPatterns.StrategyDesignPattern.Payent;

public class PaymentContext {
    private PaymentStrategy payment;

    public  PaymentContext(PaymentStrategy payment){
        this.payment = payment;
    }

    public void setPayment(PaymentStrategy payment){
        this.payment=payment;
    }

    public void pay(int amount){
        payment.pay(amount);
    }
}
