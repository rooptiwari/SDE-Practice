package Test;

public class Rotation {

    public static int [] reverse (int arr[],int si, int ei){

        while (si < ei){
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }

        return arr;
    }

    public static int[] Left_rotate(int arr[], int k){
        int n = arr.length-1;
        reverse(arr,0,k-1);
        reverse(arr,k,n);
        reverse(arr,0,n);
        return arr;
    }

    public static int[] Right_rotate(int arr[], int k){
        int n = arr.length-1;
        reverse(arr,0,n);
        reverse(arr,0,k-1);
        reverse(arr,k,n);
        return arr;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        Right_rotate(arr, 3);

        for(int a : arr){
            System.out.print(a + " ");
        }



    }
}
