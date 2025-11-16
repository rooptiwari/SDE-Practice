package Software_Engineer.LLD.ATM_Machine.TransactionStratagy;

import Software_Engineer.LLD.ATM_Machine.Card;

public interface TransactionStrategy {
    void execute(Card card, double amount);
}
