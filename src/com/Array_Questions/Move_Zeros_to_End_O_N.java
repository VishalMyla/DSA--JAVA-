package com.Array_Questions;
// this is O(N)-solution

import java.util.Arrays;

public class Move_Zeros_to_End_O_N {
    public static void main(String[] args) {
        int[] arr={0,0,10,3,4,0,6,0,7,3,0,3,0};
        method(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void method(int[] arr){
        int i1=0,i2=1;
        while(i2< arr.length){
            if(arr[0]==0){
                if(arr[i2]!=0){

                    swap(arr,i1,i2);
                    i2++;

                }
                else{
                    i2++;
                }
            }
           else{
                if(arr[i2]!=0){

                    swap(arr,i1+1,i2);
                    i2++;
                    i1++;
                }
                else{
                    i2++;
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
