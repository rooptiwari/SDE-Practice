package Software_Engineer.DesignPatterns.StrategyDesignPattern.AlertTemplet.AlertType;

public class QAstakeholder implements StakeHolderStrategy{
    @Override
    public StakeHolderType getType() {
        return StakeHolderType.QA;
    }

    @Override
    public void sendAlert(Alert alert) {
        System.out.println("Alert type : " + alert.alertType +
                "Alert name : " + alert.name +
                "Alert Detail : "+ alert.detail);
    }
}
