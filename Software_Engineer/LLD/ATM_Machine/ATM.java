package Software_Engineer.LLD.ATM_Machine;

import Software_Engineer.LLD.ATM_Machine.states.ATMState;
import Software_Engineer.LLD.ATM_Machine.states.IdleState;

public class ATM {
    private ATMState currentState;
    private Card insertedCard;

    public ATM() {
        currentState = new IdleState();
    }

    public void setCurrentState(ATMState state) {
        this.currentState = state;
    }

    public void insertCard(Card card) {
        currentState.insertCard(this, card);
    }

    public void enterPin(String pin) {
        currentState.enterPin(this, pin);
    }

    public void selectOperation(String operation) {
        currentState.selectOperation(this, operation);
    }

    public void performTransaction(double amount) {
        currentState.performTransaction(this, amount);
    }

    public void ejectCard() {
        currentState.ejectCard(this);
    }

    public Card getInsertedCard() {
        return insertedCard;
    }

    public void setInsertedCard(Card card) {
        this.insertedCard = card;
    }
}

