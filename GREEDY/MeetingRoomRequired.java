package GREEDY;
import java.util.*;

public class MeetingRoomRequired {
    public static int meetingroomCount;

    // Method to calculate the minimum number of rooms required for meetings
    public static int[][] getAllnonOverlapping(int[][] intervals) {
        // Sort intervals by start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // Min-Heap to keep track of the end times of meetings
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        meetingroomCount = 0;
        List<int[]> result = new ArrayList<>();

        // Process each interval
        for (int[] interval : intervals) {
            // If the heap is not empty and the earliest end time is <= current meeting's start time,
            // we can reuse the room, so we remove the earliest end time from the heap
            if (!heap.isEmpty() && heap.peek() <= interval[0]) {
                heap.poll();
            }

            // Add the current meeting's end time to the heap
            heap.add(interval[1]);

            // Track the maximum number of rooms required at any point
            meetingroomCount = Math.max(meetingroomCount, heap.size());

            // For this solution, we will store the interval in result as well
            result.add(interval);
        }

        System.out.println("Minimum number of rooms required: " + meetingroomCount);
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][] interval = {{1, 10}, {13, 14}, {11, 12}, {1, 2}, {2, 3}, {4, 5}, {12, 14}};
        System.out.println(Arrays.deepToString(getAllnonOverlapping(interval)));
    }
}
