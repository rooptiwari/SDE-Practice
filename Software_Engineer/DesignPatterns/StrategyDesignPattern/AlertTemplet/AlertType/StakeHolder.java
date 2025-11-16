package Software_Engineer.DesignPatterns.StrategyDesignPattern.AlertTemplet.AlertType;

public class StakeHolder {
    StakeHolderType stakeHolder;

    public StakeHolder (StakeHolderType stakeHolder){
        this.stakeHolder = stakeHolder;
    }

    public StakeHolderType getStakeHolder() {
        return stakeHolder;
    }

    public void setStakeHolder(StakeHolderType stakeHolder) {
        this.stakeHolder = stakeHolder;
    }

    @Override
    public String toString() {
        return stakeHolder.toString();
    }
}
