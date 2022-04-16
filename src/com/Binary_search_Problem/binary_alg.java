package com.Binary_search_Problem;

public class binary_alg {
    public static void main(String[] args) {
        int[] arr={0,1,2,2,2,9};
        int target=2;
        System.out.println(binary(arr,target));
    }
//    this will return the index value of the target element
//    return -1 if the target doesn't exist.
    static int binary(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return -1;
    }
}
