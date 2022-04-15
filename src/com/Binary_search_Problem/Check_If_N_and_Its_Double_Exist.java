package com.Binary_search_Problem;
//https://leetcode.com/problems/check-if-n-and-its-double-exist/
import java.util.Arrays;

class Check_If_N_and_Its_Double_Exist {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
                       int start=0,end=arr.length-1;
                    while(start<=end){
                        int mid=start+(end-start)/2;
                        if((mid!=i)&&(arr[mid]==arr[i]*2)){
                            return true;
                        }
                    if(arr[mid]>arr[i]*2){
                            end=mid-1;
                        }
                        else{
                            start=mid+1;
                        }
                    }
                    
            }
        return false;
    }
  
}