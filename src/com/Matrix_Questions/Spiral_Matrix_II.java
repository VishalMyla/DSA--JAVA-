package com.Matrix_Questions;
//https://leetcode.com/problems/spiral-matrix-ii/
import java.util.Arrays;

public class Spiral_Matrix_II {
    public static void main(String[] args) {
        int n=3;
        System.out.println(Arrays.deepToString(generateMatrix(n)));
    }
//    you can copy the code from here and paste it on the leetcode

    static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int k = 1;
        int left = 0, right = matrix[0].length;
        int top = 0, bottom = matrix.length;
        while (k <= n * n) {
//                first side
            for (int j = left; j < right && k <= n * n; j++) {
                matrix[top][j] = k;
                k++;
            }
//                 second side
            for (int j = top + 1; j < bottom && k <= n * n; j++) {
                matrix[j][right - 1] = k;
                k++;
            }
//                 third side
            for (int j = right - 2; j >= left && k <= n * n; j--) {
                matrix[bottom - 1][j] = k;
                k++;
            }
//                 fourth side
            for (int j = bottom - 2; j > top && k <= n * n; j--) {
                matrix[j][left] = k;
                k++;
            }
            left++;
            top++;
            bottom--;
            right--;

        }
        return matrix;
    }
}

