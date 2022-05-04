package com.Array_Questions;
//https://leetcode.com/problems/shuffle-the-array/submissions/
class Shuffle_the_Array {
    public int[] shuffle(int[] nums, int n) {
        int[] ans=new int[(nums.length)];
        int count1=0,count2=0;
        for(int i=0;i<nums.length;i++){
            if(i==0){
                ans[i]=nums[i];
            }
            if(i%2==0 ){
                ans[i]=nums[count1];
                count1=count1+1; 
            }
            if(!(i%2==0)){
                ans[i]=nums[count2+n];
                count2=count2+1;
            }
        }
        return ans;
    }
}