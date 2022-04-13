package com.Binary_search_Problem;

public class ceeling_of_a_number {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target=15;
        System.out.println(celling(arr,target));
    }
    static int celling(int[] arr,int target){
        int start=0;
        int end= arr.length-1;
        if(arr[end]<target){
            return -1;
        }
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]<target){
                start=mid+1;
            }
            else {
                end=mid;
            }
        }
        return end;
    }
}
