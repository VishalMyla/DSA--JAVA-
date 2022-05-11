package com.Array_Questions;

import java.util.Arrays;

public class Removal_of_DUplicates {
    public static void main(String[] args) {
        int[] arr={10,20,30,30};
        meth(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void meth(int[] arr){
        int i1=0,i2=1;

       while (i2<arr.length){
            if(arr[i2]==arr[i2-1]){
                i2++;
            }
            else{
                arr[i1+1]=arr[i2];
                i2++;
                i1++;
            }
        }

    }
}
