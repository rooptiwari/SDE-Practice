package Software_Engineer.DesignPatterns.StrategyDesignPattern.AlertTemplet.AlertType;

public class Alert {
    String name;
    String detail;
    AlertType alertType;

    public Alert(String name, String detail, AlertType alertType){
        this.name =name;
        this.detail = detail;
        this.alertType =alertType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public AlertType getAlertType() {
        return alertType;
    }

    public void setAlertType(AlertType alertType) {
        this.alertType = alertType;
    }
}
