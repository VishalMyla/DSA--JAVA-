package com.Array_Questions;

public class sorted_or_not {
    public static void main(String[] args) {
        int[] arr = {100,300,4994,4994};
        if (checker(arr)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
    static boolean checker(int[] arr){
        if(arr.length==1){
            return true;
        }
        for(int i=0;i< arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
