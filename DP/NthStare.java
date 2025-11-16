package DP;

// there are N stairs you have to reach nth stair , you can take a 1 step
// or 2 step at a time , So how many ways you can achieve the nth Stair
// All possible ways, Best Ways, Pick and Non Pick
public class NthStare {
    public static int NthstairPossiblewaytoReach(int n ){
        if(n ==0 || n == 1){
            return 1;
        }
        int a = NthstairPossiblewaytoReach(n-1) + NthstairPossiblewaytoReach(n-2);
        return a;
    }

    public static void main(String[] args) {
        System.out.println(NthstairPossiblewaytoReach(4));
    }
}
