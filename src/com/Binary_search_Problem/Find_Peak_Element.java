package com.Binary_search_Problem;
//https://leetcode.com/problems/find-peak-element/
class Find_Peak_Element {
    public int findPeakElement(int[] arr) {
    
 int start=0,end=arr.length-1;
        
        while(start<end){
            int mid=start+(end-start)/2;
           if(arr[mid]<arr[mid+1]){
               start=mid+1;
           }
            else{
                end=mid;
            }
        }
        return start;
    }
}