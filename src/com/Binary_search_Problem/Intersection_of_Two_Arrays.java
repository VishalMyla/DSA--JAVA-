package com.Binary_search_Problem;
//https://leetcode.com/problems/intersection-of-two-arrays/
import java.util.ArrayList;
import java.util.Arrays;

class Intersection_of_Two_Arrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> in=new ArrayList<Integer>();
        if(nums1.length>nums2.length){
            Arrays.sort(nums1);
            for(int i=0;i<nums2.length;i++){
                if(search(nums2[i],nums1)!=-1){
                    if(!in.contains(nums2[i])){
                        in.add(nums2[i]);
                    }
                }
            }
        }
        else{
            Arrays.sort(nums2);
            for(int i=0;i<nums1.length;i++){
                if(search(nums1[i],nums2)!=-1){
                    if(!in.contains(nums1[i])){
                        in.add(nums1[i]);
                    }
                }
            }
        }
        int[] ans=new int[in.size()];
        for(int i=0;i<in.size();i++){
            ans[i]=in.get(i);
        }
        return ans;
    }
    public int search(int target,int[] arr ) {
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
            
        }
        return -1;
    }
}