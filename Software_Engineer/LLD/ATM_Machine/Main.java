package Software_Engineer.LLD.ATM_Machine;

public class Main {
    public static void main(String[] args) {
        // ------------------ SETUP ------------------------
        User user = new User("U001", "Roopam Sharma");
        Bank bank = new Bank("B001", "Axis Bank");
        Account account = new Account("A001", 5000.0, user, bank); // Initial balance ₹5000
        Card card = new Card("1234-5678-9999", "4321", account);   // PIN = 4321

        // ATM machine setup
        ATM atm = new ATM();

        // ------------------ SCENARIO ---------------------
        // Step 1: Insert Card
        atm.insertCard(card);

        // Step 2: Enter PIN
        atm.enterPin("4321"); // Correct PIN

        // Step 3: Check Balance
        atm.selectOperation("BALANCE");

        // Step 4: Withdraw ₹2000
        atm.selectOperation("WITHDRAW");

        // Step 5: Deposit ₹1000
        atm.selectOperation("DEPOSIT");

        // Step 6: Check Balance again
        atm.selectOperation("BALANCE");

        // Step 7: Eject Card
        atm.ejectCard();
    }
}
