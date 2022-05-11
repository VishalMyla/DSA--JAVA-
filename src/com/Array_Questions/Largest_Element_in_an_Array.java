package com.Array_Questions;

public class Largest_Element_in_an_Array {
    public static void main(String[] args) {
        int[] arr={1};
        int l=arr.length;
        int max=0;
        for(int i=1;i<l;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        System.out.println(max);
    }
}
