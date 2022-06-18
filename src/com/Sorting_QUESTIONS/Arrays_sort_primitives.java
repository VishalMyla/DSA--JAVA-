package com.Sorting_QUESTIONS;

import java.util.Arrays;

public class Arrays_sort_primitives {
    public static void main(String[] args) {
        int[] arr={3,34,54,67,90,90,1,2,7,456};
        char[] ch={'z','&','A','y','Y','a'};
        Arrays.sort(arr,0,4);
        Arrays.sort(ch);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(ch));
    }
}
