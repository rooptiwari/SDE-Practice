package Software_Engineer.LLD.ATM_Machine.Service;

import Software_Engineer.LLD.ATM_Machine.Card;

public class ATMService {
    private static ATMService instance;

    private ATMService() {}

    public static ATMService getInstance() {
        if (instance == null) instance = new ATMService();
        return instance;
    }

    public void withdraw(Card card, double amount) {
        // update balance and record transaction
    }

    public void deposit(Card card, double amount) {
        // update balance and record transaction
    }

    public double checkBalance(Card card) {
        // fetch from DB
        return 0.0;
    }
}
