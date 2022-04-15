package com.Binary_search_Problem;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
class First_and_Last_Position_of_Element_in_Sorted_Array {
    public int[] searchRange(int[] nums, int target) {
        int[] ans= new int[2];
        ans[0]=searchf(nums,target);
        ans[1]=searchl(nums,target);
        return ans;
                       }
    public int searchf(int[] arr,int target){
        int start=0,end=arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                if(arr[mid]==target){
                    ans=mid;
                    end=mid-1;
                }
                
            }
        }
        return ans;
    }
     public int searchl(int[] arr,int target){
        int start=0,end=arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                if(arr[mid]==target){
                    ans=mid;
                    start=mid+1;
                }
                
            }
        }
        return ans;
    }
       
}