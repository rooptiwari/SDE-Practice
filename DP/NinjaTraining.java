package DP;
import java.util.Arrays;
public class NinjaTraining {

    public static int findMaximumPoint(int day,int last, int [][] Point, int [][] dp){

        if(dp[day][last] != -1) return dp[day][last];
        if(day==0){
            int maxi = 0;
            for(int i = 0; i<= 2; i++){
                if(i != last){
                    maxi = Math.max(maxi,Point[0][i]);
                }
            }
            return dp[day][last] = maxi;
        }
        int maxi = 0;
        for(int i = 0; i <= 2; i++){
            if(i != last){
                int Activity  = Point[day][i] + findMaximumPoint(day -1 , i ,Point, dp);
                maxi = Math.max(maxi,Activity);
            }
        }
        return dp[day][last] = maxi;
    }
    public static void main(String args[]) {
        // Define the points for each activity on each day
        int[][] Points = {{10, 40, 70},
                {20, 50, 80},
                {30, 60, 90},
                {10, 60, 40}};


        int n = Points.length; // Get the number of days
        int [][] dp = new int [n][4];
        for( int [] row : dp){
            Arrays.fill(row,-1);
        }

        int ans = findMaximumPoint(n-1,3,Points , dp); // Calculate and print the maximum points
        System.out.println(ans);
    }
}
