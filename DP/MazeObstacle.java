package DP;

import java.util.Arrays;

public class MazeObstacle {

    public static int TotalPath(int [][]matrix, int i, int j, int [][] dp){
        if( i >= 0 && j >= 0 && matrix[i][j] == -1) return 0;
        if(i == 0 && j == 0 ) return 1;
        if(i < 0 || j < 0)return 0;

        if(dp[i][j] != -1)return dp[i][j];

        int up  = TotalPath(matrix,i-1,j,dp);
        int left = TotalPath(matrix,i,j-1,dp);

        return dp[i][j] = up + left;
    }
    public static void main(String[] args) {
        int[][] maze = {
                {0, 0, 0},
                {0, -1, 0},
                {0, 0, 0}
        };
        int i = maze.length;
        int j = maze[0].length;

        int dp[][] =  new int[i][j];
        for(int []row : dp){
            Arrays.fill(row,-1);
        }
        int ans = TotalPath(maze,i-1,j-1,dp);
        System.out.println(ans);
    }
}
