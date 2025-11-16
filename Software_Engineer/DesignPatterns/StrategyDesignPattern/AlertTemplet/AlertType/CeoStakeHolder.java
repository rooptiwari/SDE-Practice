package Software_Engineer.DesignPatterns.StrategyDesignPattern.AlertTemplet.AlertType;

public class CeoStakeHolder  implements StakeHolderStrategy {

    @Override
    public StakeHolderType getType() {
        return StakeHolderType.CEO;
    }

    @Override
    public void sendAlert(Alert alert) {
        System.out.println("Send Alertv: " + alert.alertType);
    }
}
