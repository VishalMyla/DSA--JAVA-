package com.Sorting_QUESTIONS;
//https://leetcode.com/problems/missing-number/
import java.util.Arrays;

public class Missing_number {
     public static void main(String[] args) {
          int[] arr={0,1};
          Misssing_sort(arr);
          System.out.println(Arrays.toString(arr));
          System.out.println(ans(arr));
     }

     static void Misssing_sort(int[] arr){
          int start=0;

          while(start< arr.length){
               if(arr[start]<arr.length && arr[start]!= arr[arr[start]]){
                    swap(arr,start,arr[start]);
               }
               else{
                    start++;
               }
          }

     }
     static int ans(int[] arr){
          for(int i=0;i<arr.length;i++){
               if(arr[i]!=i){
                    return i;
               }
          }
          return arr.length;
     }
     static void swap(int[] arr,int first,int second){
          int temp=arr[first];
          arr[first]=arr[second];
          arr[second]=temp;
     }
}


