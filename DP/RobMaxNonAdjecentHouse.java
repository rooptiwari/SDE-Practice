package DP;
import java.util.Arrays;
public class RobMaxNonAdjecentHouse {
    public static int maxRob(int[] arr, int n, int[] dp) {
        if (n < 0) return 0;
        if (n == 0) return arr[n];
        if (dp[n] != -1) return dp[n];
        int pick = arr[n] + maxRob(arr, n - 2, dp);
        int nonPick = maxRob(arr, n - 1, dp);
        return dp[n] = Math.max(pick, nonPick);
    }

    public static void main(String[] args) {
        int[] ValuesInHouse = {2,4,3};
        int n = ValuesInHouse.length;
        if (n == 1) {
            System.out.println(ValuesInHouse[0]);// If only one house, return its value
            return;
        }
        int[] arr1 = new int[n - 1];  // Exclude first house
        int[] arr2 = new int[n - 1];  // Exclude last house
        for (int j = 1; j < n; j++) {
            arr1[j - 1] = ValuesInHouse[j]; // Store from index 0
        }
        for(int p : arr1){
            System.out.print(p+" ");
        }
        for (int j = 0; j < n - 1; j++) {
            arr2[j] = ValuesInHouse[j]; // Store from index 0
        }
        System.out.println();
        for(int p : arr2){
            System.out.print(p+" ");
        }
        System.out.println();
        int[] dp1 = new int[n - 1];
        int[] dp2 = new int[n - 1];
        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);
        int ans1 = maxRob(arr1, arr1.length - 1, dp1);
        int ans2 = maxRob(arr2, arr2.length - 1, dp2);

        int Result = Math.max(ans1, ans2);
        System.out.println("Maximum Robbed Value: " + Result);
    }
}
