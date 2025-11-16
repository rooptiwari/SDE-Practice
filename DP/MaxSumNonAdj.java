package DP;

import java.util.Arrays;

public class MaxSumNonAdj {

    public static int maxSum(int arr[], int n , int [] dp){
        if( n ==0) return arr[n];
        if(n < 0) return 0;

        if(dp[n] != -1) return dp[n];

        int pick = arr[n] + maxSum(arr,n-2,dp);
        int nonPick = maxSum(arr,n-1,dp);

        return dp[n] = Math.max(pick,nonPick);
    }

    public static int spaceOptimization(int arr[]){
        int n = arr.length;
        int prev = arr[0];
        int prev2 = 0;

        for(int i = 1; i < n; i++){
            int take = arr[i];
            if(i > 1) take += prev2;
            int nontake = 0 + prev;

            int current = Math.max(take,nontake);
            prev2 = prev;
            prev = current;
        }
        return prev;
    }


    public static void main (String [] args){
        int arr[] = {2,1,4,9};
//        int n =arr.length-1;
//        int dp [] = new int [n+1];
//        Arrays.fill(dp,-1);
//        int ans = maxSum(arr,n,dp);
//        System.out.println(ans);
       int result =  spaceOptimization(arr);
        System.out.println(result);
    }

}
