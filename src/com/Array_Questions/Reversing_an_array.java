package com.Array_Questions;

import java.util.Arrays;

public class Reversing_an_array{
    public static void main(String[] args) {
        int[] arr={8};
        method(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void method(int[] arr){
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
    }
}
