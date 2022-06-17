package com.Matrix_Questions;

import java.util.Arrays;

public class Row_coloumn_Matrix {
    public static void main(String[] args) {
        int[][] matrix={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        int target=8;
        int[] arr=search(matrix,target);
        System.out.println(Arrays.toString(arr));
    }
    static int[] search(int[][] matrix,int target){
      int row=0,col= matrix[0].length-1;
      while(row< matrix.length && col>=0){
          if(matrix[row][col]==target){
              return new int[]{row,col};
          }
          else if (matrix[row][col]>target){
              col--;
          }
          else{
              row++;
          }
      }
      return new int[]{-1,-1};
    }
}
