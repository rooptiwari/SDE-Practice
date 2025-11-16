package Software_Engineer.LLD.ATM_Machine.states;

import Software_Engineer.LLD.ATM_Machine.ATM;
import Software_Engineer.LLD.ATM_Machine.Card;

public class IdleState implements ATMState {

    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card inserted: " + card.getCardNumber());
        atm.setInsertedCard(card);
        atm.setCurrentState(new HasCardState());
    }

    @Override
    public void enterPin(ATM atm, String pin) {
        System.out.println("No card inserted. Please insert a card first.");
    }

    @Override
    public void selectOperation(ATM atm, String operationType) {
        System.out.println("Insert card and authenticate first.");
    }

    @Override
    public void performTransaction(ATM atm, double amount) {
        System.out.println("Insert card and authenticate first.");
    }

    @Override
    public void ejectCard(ATM atm) {
        System.out.println("No card to eject.");
    }
}
