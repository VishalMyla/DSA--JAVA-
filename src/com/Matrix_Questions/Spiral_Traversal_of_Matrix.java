package com.Matrix_Questions;

import java.util.ArrayList;

public class Spiral_Traversal_of_Matrix {
    public static void main(String[] args) {
        int[][] matrix={
                {1,2,3,4},{5,6,7,8},{9,10,11,12}

        };
        System.out.println(spiral(matrix));

    }
    static ArrayList spiral(int[][] matrix){
        ArrayList<Integer> in=new ArrayList<>();
        int r= matrix.length,c= matrix[0].length;

        if(r==1 && c!=1){
           for(int i=0;i<c;i++){
               in.add(i,matrix[0][i]);
           }
        }
        else if(c==1 && r!=1){
            for(int i=0;i<r;i++){
                in.add(i,matrix[i][0]);
            }
        }
        else {
            int k=r*c;

            int left =0,right= matrix[0].length;
            int top=0,bottom= matrix.length;
            while(k>0){

//            first side
                for(int j=left;j<right && k>0;j++){
                    in.add(r*c-k,matrix[top][j]);
                    k--;
                }

//           second side
                for(int j=top+1;j<bottom && k>0;j++){
                    in.add(r*c-k,matrix[j][right-1]);
                    k--;
                }

//            third side
                for(int j=right-2;j>=left && k>0;j--){
                    in.add(r*c-k,matrix[bottom-1][j]);
                    k--;
                }

//            fourth side
                for(int j=bottom-2;j>top && k>0;j--){
                    in.add(r*c-k,matrix[j][left]);
                    k--;
                }
                left++;
                top++;
                right--;
                bottom--;
            }
        }
        return in;
    }
}
