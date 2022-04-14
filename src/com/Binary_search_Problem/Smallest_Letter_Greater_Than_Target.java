package com.Binary_search_Problem;
// https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class Smallest_Letter_Greater_Than_Target {

    public char nextGreatestLetter(char[] arr, char target) {
        if(arr[arr.length-1]<=target){
            return arr[0];
        }
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){

                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return arr[start];
    }
}