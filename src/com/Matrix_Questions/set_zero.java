package com.Matrix_Questions;
//https://leetcode.com/problems/set-matrix-zeroes/submissions/
import java.util.ArrayList;
import java.util.Arrays;

public class set_zero {
    public static void main(String[] args) {
        int[][] matrix={
                {3},{2},{22},{2},{293},{0},{3},{34},{0}

        };
        System.out.println(Arrays.deepToString(setZeroes(matrix)));
    }
     static int[][] setZeroes(int[][] matrix) {
        ArrayList<Integer> row=new ArrayList<Integer>();
        ArrayList<Integer> col=new ArrayList<Integer>();
       int m=matrix.length,n= matrix[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for(int i=0;i< row.size();i++){
            for(int j=0;j<n;j++){
               matrix[row.get(i)][j]=0;
            }
        }
        for(int i=0;i< col.size();i++){
            for(int j=0;j<m;j++){
                matrix[j][col.get(i)]=0;
            }
        }
        return matrix;
    }

    }