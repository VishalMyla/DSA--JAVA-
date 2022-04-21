package com.Binary_search_Problem;
public class floor_of_a_number {
    public static void main(String[] args) {
        int[] arr={2,3,5,7,9,14,16,18};
        int target=15;
        System.out.println(floor(arr,target));
    }
    static int floor(int[] arr,int target){
        if(arr.length==0 || target<arr[0]){
            return -1;
        }
        int start=0;
        int end=arr.length-1;
        int ans=-2;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target) {
                ans=mid;
                start=mid+1;
            }
        }
        return ans;
    }
}
