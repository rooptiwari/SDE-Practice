package Software_Engineer.LLD.ATM_Machine.TransactionStratagy;

import Software_Engineer.LLD.ATM_Machine.Card;
import Software_Engineer.LLD.ATM_Machine.Service.NotificationService;

public class CheckBalanceStrategy implements TransactionStrategy {

    @Override
    public void execute(Card card, double amount) {
        double balance = card.getAccount().getBalance();
        System.out.println("Current Balance: ₹" + balance);

        // Optional: Notify or log balance inquiry
        NotificationService notifier = new NotificationService();
        notifier.notifyUser(card, "Balance inquiry: ₹" + balance);
    }
}
