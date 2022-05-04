package com.Matrix_Questions;

import java.util.Arrays;

public class Rotate_Matrix_Anti_clockwise_by_90 {


    public static void main(String[] args) {
        int[][] matrix={
                {1}
        };
        Rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
    static void Rotate(int[][] mat){
        transpose(mat);
        flip(mat);
    }
    static void transpose(int[][] mat){
        for(int i=0;i< mat.length;i++){
            for(int j=i+1;j<mat[0].length;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
    }
    static void flip(int[][] mat){

        for(int i=0;i< mat.length/2;i++){
            for(int j=0;j< mat[0].length;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[mat.length-1-i][j];
                mat[mat.length-1-i][j]=temp;
            }
        }
    }
}
