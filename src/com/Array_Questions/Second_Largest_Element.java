package com.Array_Questions;

public class Second_Largest_Element {
    public static void main(String[] args) {
        int[] arr={10,9};
        System.out.println(second_large(arr));
    }
    static int second_large(int[] arr){
        int max=0;
        int max2=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[max]){
                max2=max;
                max=i;
            }
            else if(arr[i]!=arr[max]){
                if(max2==-1 || arr[i]>arr[max2] ){
                    max2=i;
                }
            }
        }
        return max2;
    }
}
