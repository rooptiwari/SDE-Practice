package INterviewQuestion;
import java.util.Arrays;

public class TwoCityScheduling {
    public static int twoCitySchedCost(int[][] costs) {
        // Sort based on the cost difference between City A and City B
        Arrays.sort(costs, (a, b) -> (a[0] - a[1]) - (b[0] - b[1]));

        int totalCost = 0;
        int n = costs.length / 2;

        // Assign first N employees to City A
        for (int i = 0; i < n; i++) {
            totalCost += costs[i][0];  // Cost for City A
        }

        // Assign next N employees to City B
        for (int i = n; i < 2 * n; i++) {
            totalCost += costs[i][1];  // Cost for City B
        }

        return totalCost;
    }

    public static void main(String[] args) {
        int[][] costs = {
                {10, 20},
                {30, 200},
                {50, 60},
                {20, 30}
        };

        System.out.println("Minimum Cost: " + twoCitySchedCost(costs));
    }
}
