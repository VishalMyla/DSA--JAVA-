package com.Array_Questions;
//https://leetcode.com/problems/rotate-array/
class Rotate_Array {
    public void rotate(int[] arr, int k) {

        int len=arr.length;
        k=k%len;
        reverse(arr,0,len-1);
        reverse(arr,0,k-1);
        reverse(arr,k,len-1);

    }
    public void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp= arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}