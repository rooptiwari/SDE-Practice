package Software_Engineer.LLD.ATM_Machine;

import java.time.LocalDateTime;

public class Transaction {
    private String transactionId;
    private String cardNumber;
    private TransactionType type;
    private double amount;
    private TransactionStatus status;
    private LocalDateTime timestamp;

    public Transaction(String transactionId, String cardNumber, TransactionType type,
                       double amount, TransactionStatus status) {
        this.transactionId = transactionId;
        this.cardNumber = cardNumber;
        this.type = type;
        this.amount = amount;
        this.status = status;
        this.timestamp = LocalDateTime.now();
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getCardNumber() {
        return cardNumber;
    }


    public TransactionType getType() {
        return type;
    }


    public double getAmount() {
        return amount;
    }


    public TransactionStatus getStatus() {
        return status;
    }


    public LocalDateTime getTimestamp() {
        return timestamp;
    }

// Getters...
}
