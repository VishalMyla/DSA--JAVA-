package com.Binary_search_Problem;
//https://leetcode.com/problems/search-in-rotated-sorted-array/
class Search_in_Rotated_Sorted_Array {
    public int search(int[] nums, int target) {
        int pivit=finding_pivit(nums);
        if(pivit==-1){
            int br=search(nums,target,0,nums.length-1);
            if(br!=-1){
                return br;
            }
            return -1;
        }
        else{
        int br1=search(nums,target,0,pivit);
        int br2=search(nums,target,pivit+1,nums.length-1);
        
        if(br1!=-1){
            return br1;
        }
        if(br2!=-1){
            return br2;
        }
        return  -1;
    }
    }
    public int finding_pivit(int [] arr){
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
           if(mid>start && arr[mid]<arr[mid-1] ){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
    public int search(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}