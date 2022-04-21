package com.Binary_search_Problem;

public class pivit_non_duplicates {
    public static void main(String[] args) {
        int[] arr={3,4,5,1,2};
        System.out.println(peak(arr));
    }
    static int peak(int[] arr){
        int start=0,end=arr.length-1;
        if(end==0 || end==-1){
            return -1;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(mid>start && arr[mid-1]>arr[mid]){
                return mid-1;
            }
            if(arr[mid]>arr[start] ){
                start=mid+1;
            }
            else {
                end=mid-1;
            }

        }
        return -1;
    }
}
