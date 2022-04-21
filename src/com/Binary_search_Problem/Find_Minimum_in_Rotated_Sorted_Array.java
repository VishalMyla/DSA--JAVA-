package com.Binary_search_Problem;
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
class Find_Minimum_in_Rotated_Sorted_Array {
    public int findMin(int[] arr) {
        int pivit= find_pivit(arr);
        if(pivit==-1){
            return arr[0];
        }
        else{
            return arr[pivit+1];
        }
       
    }
    
    
    int find_pivit(int []arr){
       int start=0,end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid>start && arr[mid-1]>arr[mid]){
                return mid-1;
            }
            else if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(arr[start]<=arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}