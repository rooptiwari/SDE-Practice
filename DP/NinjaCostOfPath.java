package DP;

import java.util.Arrays;

public class NinjaCostOfPath {

    public static int findminimumCost(int [][] matrix , int i , int j , int [][]dp){
        if(i == 0 && j == 0) return matrix[i][j];
        if(i < 0 || j < 0) return (int) Math.pow(10,9);
        if(dp[i][j] != -1 ) return dp[i][j];
        int up = matrix[i][j] + findminimumCost(matrix, i-1, j ,dp);
        int left = matrix[i][j] + findminimumCost(matrix,i,j-1,dp);
        return dp[i][j] = Math.min(up,left);
    }
    public static void main(String[] args) {
        int matrix[][] = {
                {5, 9, 6},
                {11, 5, 2}
        };

        int i = matrix.length;
        int j = matrix[0].length;
        int [][] dp = new int [i][j];
        for(int [] row : dp){
            Arrays.fill(row, -1);
        }

        System.out.println(findminimumCost(matrix,i-1,j-1,dp));
    }
}
