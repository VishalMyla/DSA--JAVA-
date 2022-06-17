package com.Array_Questions;

import java.util.Arrays;

// brute force
public class Move_Zeros_to_End {
    public static void main(String[] args) {
        int[] arr={5};
        method(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void method(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                for(int j=i+1;j< arr.length;j++) {
                    if(arr[j]!=0){
                        swap(arr,i,j);
                        break;
                    }
                }

            }
        }
    }


    static void swap(int[] arr,int a,int b){
        int test=arr[a];
        arr[a]=arr[b];
        arr[b]=test;
    }



}
