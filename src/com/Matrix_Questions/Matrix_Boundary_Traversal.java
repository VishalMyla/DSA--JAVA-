package com.Matrix_Questions;

public class Matrix_Boundary_Traversal {
    public static void main(String[] args) {
        int[][] matrix={
                {1},
                {2},
                {3},
                {4}
        };
        Boundary_Traversal(matrix);
    }
    static void Boundary_Traversal(int[][] mat){
       int R=mat.length,C=mat[0].length;
        System.out.println("R is "+R );
        System.out.println("C is "+ C);
       if(C==1 && R!=1){
           for (int[] ints : mat) {
               System.out.print(ints[0] + " ");
           }
       }
       else if(R==1 && C!=1){
           for(int i=0;i<C;i++){
               System.out.print(mat[0][i]+" ");
           }
       }
       else{
           for(int i=0;i<C;i++){
               System.out.print(mat[0][i]+" ");
           }
           for(int i=1;i<R;i++){
               System.out.print(mat[i][C-1]+" ");
           }
           for(int i=C-2;i>=0;i--){
               System.out.print(mat[R-1][i]+" ");
           }
           for(int i=R-2;i>0;i--){
               System.out.print(mat[i][0]+" ");
           }
       }

    }
}
