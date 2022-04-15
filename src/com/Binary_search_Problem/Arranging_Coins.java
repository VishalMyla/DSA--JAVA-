package com.Binary_search_Problem;
//https://leetcode.com/problems/arranging-coins/
class Arranging_Coins {
    public int arrangeCoins(int x) {
        long start=1,end=x;
        while(start<=end){
            long mid=start+(end-start)/2;
            long sum=mid*(mid+1)/2;
            if(sum==x){
                return (int)mid;
            }
            else if(sum<x){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return (int)end;
    }
}