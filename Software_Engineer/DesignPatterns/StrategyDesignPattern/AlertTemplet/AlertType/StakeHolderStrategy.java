package Software_Engineer.DesignPatterns.StrategyDesignPattern.AlertTemplet.AlertType;

public interface StakeHolderStrategy {
    StakeHolderType getType();
    void sendAlert(Alert alert);
}
