package com.Matrix_Questions;
//https://leetcode.com/problems/spiral-matrix/
import java.util.ArrayList;

class Spiral_Matrix {
    public ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> in=new ArrayList<Integer>();
       int m = matrix.length,n = matrix[0].length;  
        if(m==1 & n!=1){
            for(int i=0;i<n;i++){
                in.add(i,matrix[0][i]);
            }
        }
        else if(n==1 && m!=1){
             for(int i=0;i<m;i++){
                in.add(i,matrix[i][0]);
            }
        }
        else{
          int left=0,right=matrix[0].length;
        int top=0,bottom=matrix.length;
            int coun=m*n;
            while(coun>0){
//                 first side
                for(int j=left;j<right && coun>0;j++){
                    in.add(m*n-coun,matrix[top][j]);
                    coun--;
                }
//                 second side
                for(int j=top+1;j<bottom && coun>0;j++){
                    in.add(m*n-coun,matrix[j][right-1]);
                    coun--;
                }
//                 third side
              for(int j=right-2;j>=left && coun>0;j--){
                    in.add(m*n-coun,matrix[bottom-1][j]);
                    coun--;
                }
//                 fourth side
                for(int j=bottom-2 ;j>top && coun>0;j--){
                    in.add(m*n-coun,matrix[j][left]);
                    coun--;
                }
                left++;
                top++;
                bottom--;
                right--;
                
            }
        }
        return in;
    }
}