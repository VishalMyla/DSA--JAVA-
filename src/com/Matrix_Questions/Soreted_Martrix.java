package com.Matrix_Questions;

import java.util.Arrays;

public class Soreted_Martrix {
    public static void main(String[] args) {
        int[][] matrix={
                {1,3},


        };
        int target=0;
        System.out.println(Arrays.toString(M_search(matrix,target)));
    }
    static int[] M_search(int[][] matrix,int target){
        int row=matrix.length;
        int col=matrix[0].length;

        if(row==1 ){
            return search(matrix,row-1,0,col-1,target);
        }


            int rstart=0, rend= matrix.length-1,midcol=(col-1)/2;
            while (rstart<rend-1){
                int mid=rstart+(rend-rstart)/2;
                if(matrix[mid][midcol]==target){
                    return new int[]{mid,midcol};
                }
                else if(matrix[mid][midcol]>target){
                    rend=mid;
                }
                else {
                    rstart=mid;
                }
            }
            if(matrix[rstart][midcol]==target){
                return new int[]{rstart,midcol};
            }
            else if(matrix[rend][midcol]==target){
                return new int[]{rend,midcol};
            }
            if (target <= matrix[rstart][midcol - 1]) {
                return search(matrix,rstart,0,midcol-1,target);
            }
            else if(target>=matrix[rstart][midcol+1] && target<=matrix[rstart][col-1]){
                return search(matrix,rstart,midcol+1,col-1,target);
            }
            else if(target>=matrix[rend][0] && target<=matrix[rend][midcol-1]){
                search(matrix,rend,0,midcol-1,target);
            }
            else{
                search(matrix,rend,midcol+1,col-1,target);
            }
            return new int[]{-1,-1};

    }
    static int[] search(int[][] matrix,int row,int cstart,int cend,int target){
        while(cstart<=cend){
            int cmid=cstart+(cend-cstart)/2;
            if(matrix[row][cmid]==target){
                return new int[]{row,cmid};
            }
           else  if(matrix[row][cmid]>target){
                cend=cmid-1;
            }
           else{
               cstart=cmid+1;
            }


        }
        return new int[]{-1,-1};
    }

}

