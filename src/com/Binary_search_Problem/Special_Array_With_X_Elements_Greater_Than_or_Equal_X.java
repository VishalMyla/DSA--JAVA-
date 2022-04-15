package com.Binary_search_Problem;
//https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/
class Special_Array_With_X_Elements_Greater_Than_or_Equal_X {
    public int specialArray(int[] arr) {
        int start=1,end=arr.length;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(check(arr,mid)==mid){
                return mid;
            }
            else if(check(arr,mid)>mid){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public int check(int[] arr,int x){
        int co=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=x){
                co++;
            }
        }
        return co;
    }
}