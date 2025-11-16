package Software_Engineer.LLD.ATM_Machine;

public class Account {
    private String accountId;
    private double balance;
    private User user;
    private Bank bank;

    public Account(String accountId, double balance, User user, Bank bank) {
        this.accountId = accountId;
        this.balance = balance;
        this.user = user;
        this.bank = bank;
    }

    public String getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public User getUser() {
        return user;
    }

    public Bank getBank() {
        return bank;
    }
}

