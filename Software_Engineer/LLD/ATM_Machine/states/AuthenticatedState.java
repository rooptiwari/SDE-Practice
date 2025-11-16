package Software_Engineer.LLD.ATM_Machine.states;

import Software_Engineer.LLD.ATM_Machine.ATM;
import Software_Engineer.LLD.ATM_Machine.Card;
import Software_Engineer.LLD.ATM_Machine.TransactionStratagy.TransactionStrategy;
import Software_Engineer.LLD.ATM_Machine.Transaction_Factory.TransactionFactory;

public class AuthenticatedState implements ATMState {

    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card already inserted.");
    }

    @Override
    public void enterPin(ATM atm, String pin) {
        System.out.println("PIN already verified.");
    }

    @Override
    public void selectOperation(ATM atm, String operationType) {
        System.out.println("Operation selected: " + operationType);
        TransactionStrategy strategy = TransactionFactory.getStrategy(operationType);
        strategy.execute(atm.getInsertedCard(), operationType.equals("BALANCE") ? 0.0 : 100.0); // dummy amount
    }

    @Override
    public void performTransaction(ATM atm, double amount) {
        System.out.println("Transaction performed.");
    }

    @Override
    public void ejectCard(ATM atm) {
        System.out.println("Card ejected.");
        atm.setInsertedCard(null);
        atm.setCurrentState(new IdleState());
    }
}

