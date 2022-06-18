package com.Sorting_QUESTIONS;
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
import java.util.ArrayList;

class Find_All_Numbers_Disappeared_in_an_Array {
    public ArrayList<Integer> findDisappearedNumbers(int[] arr) {
        sort(arr);
        ArrayList<Integer> in=new ArrayList<Integer>();
        int p=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                in.add(i+1);
                p++;
            }
        }
       
        return in;
    }
    void sort(int[] arr){
        int start=0;
        while(start<arr.length){
            int correct=arr[start]-1;
            if(  arr[start]!=arr[correct] ){
                swap(arr,start,correct);
            }
            else {
                start++;
            }
        }
    }
    void swap(int[] arr,int first ,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

}