package DP;

public class PartitionaEqualSubsetSum {

    public static boolean ifndboolean(int n , int target, int [] arr){
        if(target == 0)return true;
        if( n == 0) return arr[n] == target;
        boolean nontake = ifndboolean(n-1,target,arr);
        boolean take = false ;
        if(arr[n] <= target){
            take = ifndboolean(n-1,target - arr[n],arr);
        }
        return take || nontake;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,1,2,3};
        int totsum= 0;
        for(int i = 0 ; i < arr.length; i++){
            totsum += arr[i];
        }
        int n = arr.length;
        int k = totsum/2;
        int [][] dp = new int[n][k+1];
        if(totsum%2 != 0){
            System.out.println("false");
        }else{
            boolean ans =  ifndboolean(n-1,k,arr);
            System.out.println(ans);
        }




    }
}
