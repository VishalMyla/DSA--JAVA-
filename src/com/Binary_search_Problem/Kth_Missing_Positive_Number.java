package com.Binary_search_Problem;
//https://leetcode.com/problems/kth-missing-positive-number/
class Kth_Missing_Positive_Number {
    public int findKthPositive(int[] arr, int k) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int p = arr[mid] - (mid + 1);
            if (p < k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start + k;
    }
}