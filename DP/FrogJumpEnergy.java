package DP;

import java.util.Arrays;

public class FrogJumpEnergy {

    public static int countminimumEnergy(int n , int [] arr, int []dp){

        if(n==0){
            return 0;
        }
        if(dp[n] != -1) return dp[n];
        int left  = countminimumEnergy(n-1,arr,dp) + Math.abs(arr[n] - arr[n-1]);
        int right = Integer.MAX_VALUE;
        if(n > 1){
            right = countminimumEnergy(n-2,arr,dp) + Math.abs(arr[n] - arr[n-2]);
        }
        return dp[n]= Math.min(left,right);
    }

    public static void main(String args []){
        int [] arr= {10,20,10,30,60};
        int n =arr.length-1;
        int dp[] = new int[n+1];
        Arrays.fill(dp , -1);
        int result = countminimumEnergy(n, arr, dp);
        System.out.println(result);
    }
}
