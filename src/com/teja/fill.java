package com.teja;

import java.util.ArrayList;
import java.util.Arrays;

public class fill {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));
    }
    static int[] intersection(int[] nums1, int[] nums2) {
        int a=nums1.length,b=nums2.length;
        ArrayList<Integer> fun=new ArrayList<Integer>();
        if(a>b){

            int[] temp=nums2;
            for(int i=0;i<b;i++){
                if(is_exiist(temp[i],nums1)==true){
                    if(fun.contains(temp[i])==false){
                        fun.add(temp[i]);
                    }
                }
            }
        }
        else{
            int[] temp=nums1;
            for(int i=0;i<a;i++){
                if(is_exiist(temp[i],nums2)==true){
                    if(fun.contains(temp[i])==false){
                        fun.add(temp[i]);
                    }
                }
            }
        }

        int op[] = new int[fun.size()];
        for(int i=0;i<fun.size();i++){
            op[i] = fun.get(i);
        }

        return op;

    }
    static boolean is_exiist(int target,int[] arr){
        int start=0,end=arr.length;
        while(start<=end){
            int mid=start +(end-start)/2;
            if(arr[mid]==target){
                return true;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return false;
    }
}
