package DP;

import java.util.Arrays;

public class MinTriangel {
    public static int miniTrainglepath(int i , int j, int [][] matrix, int [][] dp, int n){
        if(dp[i][j] != -1) return dp[i][j];

        if(i == n-1) return matrix[i][j];

        int down = matrix[i][j] + miniTrainglepath(i+1,j,matrix,dp,n);
        int rightDown = matrix[i][j] + miniTrainglepath(i+1,j+1,matrix,dp,n);

        return dp[i][j] = Math.min(down,rightDown);
    }
    public static void main(String[] args) {
        int triangle[][] = {{1},
                {2, 3},
                {3, 6, 7},
                {8, 9, 6, 10}};

        int n = triangle.length;
        int dp[][] = new int [n][n];
        for(int row[] : dp){
            Arrays.fill(row,-1);
        }
        int ans = miniTrainglepath(0,0,triangle,dp,n);
        System.out.println(ans);
    }
}
