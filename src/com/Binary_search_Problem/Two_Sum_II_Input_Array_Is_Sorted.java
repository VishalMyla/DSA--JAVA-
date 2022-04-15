package com.Binary_search_Problem;
//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
class Two_Sum_II_Input_Array_Is_Sorted {
    public int[] twoSum(int[] numbers, int target) {
            int[] ans=new int[2];
       for(int i=0;i<numbers.length;i++){
           int num=target-numbers[i];
           int br=search(numbers,num,i+1,numbers.length-1);
           if(br!=-1){
               ans[0]=i+1;
               ans[1]=br+1;
               break;
           }
       }
        return ans;
        
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