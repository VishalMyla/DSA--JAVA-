package com.Binary_search_Problem;
//https://leetcode.com/problems/sqrtx/
class Sqrt_x {
    public int mySqrt(int x) {
        int start=1,end=x;
        while(start<=end){
            int mid=start+(end-start)/2;
            
            if(mid==x/mid){
                return mid;
            }
            else if(mid>x/mid){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
            
        }
        
        return end;
    }
}