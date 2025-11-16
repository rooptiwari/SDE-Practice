package DP;

import java.util.Arrays;

public class FallingPathSum {
    public static int findMaximumPath(int i , int j , int m , int[][] matrix, int [][] dp){
        if(j < 0 || j >= m)return (int)Math.pow(-10,9);
        if(i == 0) return matrix[0][j];
        if(dp[i][j] != -1)return dp[i][j];

        int up = matrix[i][j] + findMaximumPath(i-1,j,m,matrix,dp);
        int leftDigonal = matrix[i][j] + findMaximumPath(i-1,j-1,m,matrix,dp);
        int rightDigonal = matrix[i][j] + findMaximumPath(i-1,j+1,m,matrix,dp);

        return dp[i][j] = Math.max(up, Math.max(leftDigonal,rightDigonal));
    }

    public static int getMaxPathSum(int [][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        int [][] dp = new int[n][m];

        for(int []row : dp){
            Arrays.fill(row,-1);
        }

        int maxi = Integer.MIN_VALUE;

        for(int j = 0; j < m ; j++){
            int ans = findMaximumPath(n-1, j ,m ,matrix,dp);
            maxi = Math.max(maxi,ans);
        }
        return  maxi;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 10, 4},
                          {100, 3, 2, 1},
                          {1, 1, 20, 2},
                          {1, 2, 2, 1}};

        // Call the getMaxPathSum function and print the result
        System.out.println(getMaxPathSum(matrix));
    }
}
