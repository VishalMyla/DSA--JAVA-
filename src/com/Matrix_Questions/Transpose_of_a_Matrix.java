package com.Matrix_Questions;

import java.util.Arrays;

public class Transpose_of_a_Matrix{
    public static void main(String[] args) {
        int[][] matrix={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        transpose(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
    static void transpose(int[][] mat){
        for(int i=0;i< mat.length;i++){
            for(int j=i+1;j< mat[0].length;j++){
               int temp=mat[i][j];
               mat[i][j]=mat[j][i];
               mat[j][i]=temp;
            }
        }
    }
}
