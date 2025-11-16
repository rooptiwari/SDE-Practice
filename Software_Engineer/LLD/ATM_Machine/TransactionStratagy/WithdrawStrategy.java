package Software_Engineer.LLD.ATM_Machine.TransactionStratagy;

import Software_Engineer.LLD.ATM_Machine.Account;
import Software_Engineer.LLD.ATM_Machine.Card;
import Software_Engineer.LLD.ATM_Machine.Service.NotificationService;

public class WithdrawStrategy implements TransactionStrategy {

    @Override
    public void execute(Card card, double amount) {
        Account account = card.getAccount();
        double currentBalance = account.getBalance();

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return;
        }

        if (currentBalance >= amount) {
            account.setBalance(currentBalance - amount);
            System.out.println("Withdrawal of ₹" + amount + " successful.");
            System.out.println("Remaining Balance: ₹" + account.getBalance());

            // Optional: Save transaction to DB, notify user
            NotificationService notifier = new NotificationService();
            notifier.notifyUser(card, "₹" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}


