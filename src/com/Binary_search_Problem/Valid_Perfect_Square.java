package com.Binary_search_Problem;
//https://leetcode.com/problems/valid-perfect-square/
class Valid_Perfect_Square {
    public boolean isPerfectSquare(int x) {
        long start=1,end=x;
        while(start<=end){
           long mid=start+(end-start)/2;
            long squd=mid*mid;
            if(squd==x) {
                return true;
            }
        else if(squd>x){
            end=mid-1;
        }
            else{
                start=mid+1;
            }
        
        
    }
        return false;
}
}