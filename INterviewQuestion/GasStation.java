package INterviewQuestion;
/*
There are n gas stations along a circular route, where the amount of gas at the ith station is gas[i].
You have a car with an unlimited gas tank and it costs cost[i] of gas to travel
from the ith station to its next (i + 1)th station. You begin the journey
with an empty tank at one of the gas stations.
Given two integer arrays gas and cost, return the starting gas station's index
if you can travel around the circuit once in the clockwise direction, otherwise return -1.
If there exists a solution, it is guaranteed to be unique.

Example 1:
Input: gas = [1,2,3,4,5], cost = [3,4,5,1,2]
Output: 3
 */

public class GasStation {
    public static int canCompleteCircuit(int[] gas, int [] cost){
//        int gasCount = 0;
//        int costCount = 0;
//        if(gas.length != cost.length){
//            return -1;
//        }
//        for(int i = 0; i < gas.length; i++){
//            gasCount += gas[i];
//            costCount += cost[i];
//        }
//        if(gasCount != costCount){
//            return -1;
//        }

        int start = 0 , currgass = 0, Totalgas = 0;
        for( int i = 0 ; i < gas.length; i++){
            int fule = gas[i] - cost[i];
            Totalgas += fule;
            currgass += fule;
            if(currgass < 0){
                start = i+1;
                currgass = 0;
            }
        }
        return Totalgas < 0 ? -1 : start;
    }

    public static void main(String[] args) {
        int[] gas = {4, 4}, cost = {1, 8};
        int ans = canCompleteCircuit(gas, cost);
        System.out.println(ans);
    }
}
