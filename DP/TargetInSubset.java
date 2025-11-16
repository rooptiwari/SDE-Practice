package DP;

import java.util.Arrays;

public class TargetInSubset {

    public static boolean findTheTarget(int n, int target , int [] arr, int dp[][]){
        if(target == 0)return true;
        if( n == 0) return arr[n] == target;
        if(dp[n][target] != -1 ) return dp[n][target] != 0;
        boolean nontake = findTheTarget(n-1,target,arr,dp);
        boolean take = false ;
        if(arr[n] <= target){
            take = findTheTarget(n-1,target - arr[n],arr,dp);
        }
        dp[n][target] = nontake || take? 1 : 0;
        return take || nontake;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        int k = 11;
        int n = arr.length;
        int [][]dp = new int[n][k+1];
        for(int []row : dp){
            Arrays.fill(row,-1);
        }
        boolean ans = findTheTarget(n-1,k,arr,dp);
        System.out.println(ans);
    }
}
