package Software_Engineer.LLD.ATM_Machine;

public class Bank {
    private String bankId;
    private String name;

    public Bank(String bankId, String name) {
        this.bankId = bankId;
        this.name = name;
    }

    public String getBankId() {
        return bankId;
    }

    public String getName() {
        return name;
    }
}
