package DP;

import java.util.Arrays;

public class CharyPick {

    public static int maximumChryPick(int i , int j1, int j2, int n , int m, int [][] matrix){
        if(j1 < 0 || j1 >= m || j2 < 0 || j2 >= m ) return (int)Math.pow(-10,9);

       if(i == n-1) {
            if (j1 == j2) {
                return matrix[i][j1];
            } else {
                return matrix[i][j1] + matrix[i][j2];
            }
        }

       int maxi = Integer.MIN_VALUE;
       for(int di = -1; di <= 1; di++){
           for(int dj = -1 ; dj <= 1; dj++){
               int ans;
               if(j1 == j2 )
                  ans =  matrix[i][j1] + maximumChryPick(i+1, j1+di, j2 +dj, n ,m , matrix);
               else
                   ans =  matrix[i][j1] + matrix[i][j2] + maximumChryPick(i+1, j1+di, j2 +dj, n ,m , matrix);

               maxi = Math.max(maxi,ans);
           }
       }
       return maxi;
    }

    public static void main(String[] args) {
        int matrix[][] = {{2, 3, 1, 2},
                          {3, 4, 2, 2},
                          {5, 6, 3, 5}};
        int n = matrix.length;
        int m = matrix[0].length;

//        int dp[][][] = new int [n][m][m];
//        for(int [][] row1 : dp){
//            for(int []row2 : row1){
//                Arrays.fill(row2, -1);
//            }
//        }

        int ans = maximumChryPick(0,0,m-1,n,m,matrix);
        System.out.println(ans);

    }
}
