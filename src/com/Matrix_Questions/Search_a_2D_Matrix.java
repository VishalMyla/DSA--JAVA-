package com.Matrix_Questions;

public class Search_a_2D_Matrix {
    public static void main(String[] args) {
        int[][] matrix={
                {1,1},
                {2,2}

        };
        int target=0;
        System.out.println(M_search(matrix,target));
    }
    static boolean M_search(int[][] matrix,int target){
        int row=matrix.length;
        int col=matrix[0].length;
        if(row==1 ){
          return   search(matrix,row-1,0,col-1,target);
        }
        if(col==1){
            return search2(matrix,0,0,row-1,target);
        }


        int rstart=0, rend= matrix.length-1,midcol=(col-1)/2;
        while (rstart<rend-1){
            int mid=rstart+(rend-rstart)/2;
            if(matrix[mid][midcol]==target){
                return true;
            }
            else if(matrix[mid][midcol]>target){
                rend=mid;
            }
            else {
                rstart=mid;
            }
        }
        if(matrix[rstart][midcol]==target){
            return true;
        }
        else if(matrix[rend][midcol]==target){
            return true;
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
        return false;
    }
    static boolean search(int[][] matrix,int row,int cstart,int cend,int target){
        while(cstart<=cend){
            int cmid=cstart+(cend-cstart)/2;
            if(matrix[row][cmid]==target){
                return true;
            }
            else  if(matrix[row][cmid]>target){
                cend=cmid-1;
            }
            else{
                cstart=cmid+1;
            }


        }
        return false;
    }
    static boolean search2(int[][] matrix,int col,int rstart,int rend,int target){
        while(rstart<=rend){
            int rmid=rend+(rstart-rend)/2;
            if(matrix[rstart][col]==target){
                return true;
            }
            else if(matrix[rstart][col]>target){
                rend=rmid-1;
            }
            else {
                rstart=rmid+1;
            }
        }
        return false;
    }
}
