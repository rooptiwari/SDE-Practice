package SEPIENT;
import java.util.HashSet;
import java.util.Set;

public class CLASS {

    public static int countMaxLenth(int [] nums){
        Set<Integer> set = new HashSet<>();
        for( int num : nums) set.add(num);
        int longestCons = 0;
        for( int num : set){
            if(!set.contains(num-1)){
                int currentNumber = num;
                int currntStreakLength = 1;
                while(set.contains(currentNumber + 1)){
                    currentNumber++;
                    currntStreakLength++;
                }
                longestCons = Math.max(longestCons,currntStreakLength);
            }
        }
        return longestCons;
    }
    public static void main(String[] args) {
        int [] arr = {203,1,200,2,201,202,3};
        int a = countMaxLenth(arr);
        System.out.println(a);
    }
}

// Employee e = new Employee();
//