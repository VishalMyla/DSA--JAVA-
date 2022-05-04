package com.Array_Questions;
//https://leetcode.com/problems/concatenation-of-array/
class Concatenation_of_Array {
    public int[] getConcatenation(int[] nums) {
        int[] ans= new int[2*(nums.length)];
        for(int i=0;i<(nums.length);i++) {
            if (i < (nums.length))
                ans[i] = nums[i];

        }
        for(int i=0;i<(nums.length);i++) {
            if (i < (nums.length))
                ans[i+(nums.length)] = nums[i];

        }

        return ans;
            
    }
}