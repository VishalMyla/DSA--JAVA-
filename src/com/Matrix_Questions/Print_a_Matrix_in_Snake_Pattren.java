package com.Matrix_Questions;

public class Print_a_Matrix_in_Snake_Pattren {

    public static void main(String[] args) {
	// write your code here
        int[][] matrix={


        };
        snake(matrix);
    }
    static void snake(int[][] mat){
        for(int i=0;i<mat.length;i++){
            if(i%2!=0){
                for(int j=mat[i].length-1;j>=0;j--){
                    System.out.print(mat[i][j]+" ");
                }
            }
            else{
                for(int j=0;j< mat[i].length;j++){
                    System.out.print(mat[i][j]+" ");
                }
            }

        }
    }
}
