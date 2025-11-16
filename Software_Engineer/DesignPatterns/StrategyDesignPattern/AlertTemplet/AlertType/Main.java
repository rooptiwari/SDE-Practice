package Software_Engineer.DesignPatterns.StrategyDesignPattern.AlertTemplet.AlertType;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static Software_Engineer.DesignPatterns.StrategyDesignPattern.AlertTemplet.AlertType.AlertType.ALERT_TYPE_A;

public class Main {
    public static void main(String[] args) {


        Alert alert = new Alert("ServiceDown", "please do it fast", ALERT_TYPE_A);
//    StakeHolder CEO = new StakeHolder( StakeHolderType.CEO);
//    StakeHolder QA = new StakeHolder( StakeHolderType.QA);
//    StakeHolder DEV = new StakeHolder( StakeHolderType.DEV);
//    StakeHolder Manager = new StakeHolder( StakeHolderType.Manager);
//    StakeHolder ON_CALL = new StakeHolder( StakeHolderType.ON_CALL);

        List<StakeHolder> stakeHolders = Arrays.asList(
                new StakeHolder(StakeHolderType.CEO),
                new StakeHolder(StakeHolderType.QA),
                new StakeHolder(StakeHolderType.DEV),
                new StakeHolder(StakeHolderType.Manager),
                new StakeHolder(StakeHolderType.ON_CALL)
        );

        Iterator<StakeHolder> iterator = stakeHolders.iterator();
        while (iterator.hasNext()) {
            StakeHolder s = iterator.next();
            if(StakeHolderType.CEO.equals(s.getStakeHolder())){
                System.out.println(" Message for CEO ::::");
                System.out.println("Alert : " + alert.name);
                System.out.println();
            }
            if(s.getStakeHolder().equals(StakeHolderType.QA)){
                System.out.println(" Message for QA ::::");
                System.out.println(
                        "Alert name : " + alert.name +" "+
                        "Alert Detail : " + alert.detail + " "+
                        "Alert Type : " + alert.alertType
                );
                System.out.println();
            }
            if(s.getStakeHolder().equals(StakeHolderType.DEV)){
                System.out.println(" Message for DEV ::::");
                System.out.println(
                        "Alert name : " + alert.name +" "+
                                "Alert Detail : " + alert.detail + " "+
                                "Alert Type : " + alert.alertType
                );
                System.out.println();
            }
        }
    }
}
