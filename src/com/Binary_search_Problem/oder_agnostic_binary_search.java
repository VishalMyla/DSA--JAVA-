package com.Binary_search_Problem;

public class oder_agnostic_binary_search {
    public static void main(String[] args) {
        int[] arr={99,98,56,34,22,11,9,5,3};
        int target=9;
        System.out.println(oder_agnost_bs(arr,target));
    }
//    array can be in asc or dec it will return the target
//    index if exists .
    static int oder_agnost_bs(int[] arr,int target){
        int start= 0;
        int end= arr.length-1;
        boolean isasc;
        if(arr[start]>arr[end]){
            isasc=false;
        }
        else {
            isasc=true;
        }
        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isasc){
                if(arr[mid]>target){
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
            else {
                if(arr[mid]>target){
                    start=mid+1;
                }
                else {
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
