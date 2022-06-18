package com.Rough_work;

import java.util.Arrays;

public class xjnvxjc {
    public static void main(String[] args) {
        
        int[] arr={7,10,4,10,6,5,2};
        method(arr);
        System.out.println();
    }
    static void method(int[] arr){
        int len=arr.length;
        for(int i=0;i<len;i++) {
            for(int j=i+1;j<len;j++){
                if(arr[j]>arr[i]){
                    System.out.println(arr[j]);
                }
                break;
            }
        }
    }
}
