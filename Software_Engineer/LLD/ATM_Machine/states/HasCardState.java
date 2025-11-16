package Software_Engineer.LLD.ATM_Machine.states;

import Software_Engineer.LLD.ATM_Machine.ATM;
import Software_Engineer.LLD.ATM_Machine.Card;

public class HasCardState implements ATMState {

    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card already inserted.");
    }

    @Override
    public void enterPin(ATM atm, String pin) {
        if (atm.getInsertedCard().getPin().equals(pin)) {
            System.out.println("PIN verified.");
            atm.setCurrentState(new AuthenticatedState());
        } else {
            System.out.println("Invalid PIN.");
            atm.setCurrentState(new IdleState());  // Optional: eject card on failure
        }
    }

    @Override
    public void selectOperation(ATM atm, String operationType) {
        System.out.println("Enter PIN before selecting operation.");
    }

    @Override
    public void performTransaction(ATM atm, double amount) {
        System.out.println("Enter PIN before performing transaction.");
    }

    @Override
    public void ejectCard(ATM atm) {
        System.out.println("Card ejected.");
        atm.setInsertedCard(null);
        atm.setCurrentState(new IdleState());
    }
}
