package INterviewQuestion;

public class Product_withoutSelf {
    public static int[] productarr(int arr[]){
        if(arr.length == 0)return arr;
        int n = arr.length;
        int [] result = new int[n];
        int product = 1;
        for( int i =0; i < n; i++){
            product = product * arr[i];
        }
        for( int i = 0 ; i < n; i++){
            arr[i]  = product/arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        productarr(arr);
        for( int a : arr){
            System.out.print(a + " ");
        }
    }
}
