package DP;

import java.util.Arrays;

public class TotalNumberOfPath  {

    public static int calculateTotalPath(int [][] matrix, int i , int j ){
        if(i < 0 || j < 0) return 0;
        if(i == 0 && j == 0)return 1;
        if(matrix[i][j] != -1)return matrix[i][j];
        int up = calculateTotalPath(matrix,i-1,j);
        int left = calculateTotalPath(matrix,i,j-1);
        return  matrix[i][j] = up + left;
    }
    public static void main(String[] args) {
        int [][] matrix = new int [3][3];
        int i = matrix.length-1;
        int j = matrix[0].length-1;
        for(int [] row : matrix){
            Arrays.fill(row,-1);
        }
        System.out.println(calculateTotalPath(matrix,i,j));

    }
}
