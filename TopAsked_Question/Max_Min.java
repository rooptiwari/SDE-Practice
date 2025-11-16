package TopAsked_Question;


// Find the maximum and minimum element in the Array
public class Max_Min {
    public static void main(String[] args) {
        int arr [] = {3,1,7,9,2};

        int min = arr[0];
        int max = arr[0];

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }else if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("min : " + min);
        System.out.println("max : " + max);


    }
}
