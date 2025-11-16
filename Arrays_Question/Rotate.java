package Arrays_Question;

public class Rotate {

    public static int[] revrse(int[] arrs , int si, int ei){
        while (si<ei){
            int temp = arrs[si];
            arrs[si] = arrs[ei];
            arrs[ei] = temp;
            si++;
            ei--;
        }
        return arrs;
    }

    public static int[] rotateleft(int [] arr, int indx){
        int n = arr.length-1;

        revrse(arr,0,indx-1);
        revrse(arr,indx,n);
        revrse(arr,0,n);
        return arr;
    }

    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6,7,8,9};
        int indx = 3;
        rotateleft(arr,indx);
        for(int e : arr){
            System.out.print(e + " ");
        }
    }
}
