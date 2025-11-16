package GREEDY;
/*
You have a meeting of intervals
Give me maximum NON-Overlapping Intervals
( end == start ) can be considered as non overlapping
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Intervals {
    public static int meetingroomCount;
    public static int[][] getAllnonOverlaping(int[][] intervals){
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[1],b[1]));
        meetingroomCount = 1;
        List<int []> mearge = new ArrayList<>();
        for(int [] interval : intervals){
            if(mearge.isEmpty() || mearge.get(mearge.size()-1)[1] <= interval[0]){
                mearge.add(interval);
            }else{
                meetingroomCount++;
            }
        }
        System.out.println(meetingroomCount);
        return mearge.toArray(new int [mearge.size()][]);
    }
    public static void main(String[] args) {
        int [][] interval = {{1,10},{13,14},{11,12},{1,2},{2,3},{4,5},{12,14}};
        System.out.println(Arrays.deepToString(getAllnonOverlaping(interval)));
    }
}