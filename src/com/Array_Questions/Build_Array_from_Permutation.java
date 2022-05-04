package com.Array_Questions;
//https://leetcode.com/problems/build-array-from-permutation/submissions/
class Build_Array_from_Permutation {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i : nums){
            ans[i]=nums[nums[i]];
        }
        return ans;
        
    }
}