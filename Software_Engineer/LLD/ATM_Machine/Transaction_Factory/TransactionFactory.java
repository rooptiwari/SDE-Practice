package Software_Engineer.LLD.ATM_Machine.Transaction_Factory;

import Software_Engineer.LLD.ATM_Machine.TransactionStratagy.CheckBalanceStrategy;
import Software_Engineer.LLD.ATM_Machine.TransactionStratagy.DepositStrategy;
import Software_Engineer.LLD.ATM_Machine.TransactionStratagy.TransactionStrategy;
import Software_Engineer.LLD.ATM_Machine.TransactionStratagy.WithdrawStrategy;

public class TransactionFactory {
    public static TransactionStrategy getStrategy(String type) {
        switch(type) {
            case "WITHDRAW": return new WithdrawStrategy();
            case "DEPOSIT": return new DepositStrategy();
            case "BALANCE": return new CheckBalanceStrategy();
            default: throw new IllegalArgumentException("Invalid type");
        }
    }
}

