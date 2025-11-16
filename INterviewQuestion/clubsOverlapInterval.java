package INterviewQuestion;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class clubsOverlapInterval {

    public static int[][]  meargeTheInterval(int [][] intervals){
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merge = new ArrayList<>();

        for(int [] interval : intervals){
            if(merge.isEmpty() || merge.get(merge.size()-1)[1] < interval[0]){
                merge.add(interval);
            }else{
                merge.get(merge.size()-1)[1] =
                        Math.max(merge.get(merge.size()-1)[1],interval[1]);
            }
        }
        return merge.toArray(new int [merge.size()][]);
    }
    public static void main(String[] args) {
        int [][] interval = {{1,10},{11,12},{1,2},{12,14}};
        System.out.println(Arrays.deepToString(meargeTheInterval(interval)));
    }
}
