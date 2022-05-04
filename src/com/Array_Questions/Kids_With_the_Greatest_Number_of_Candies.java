package com.Array_Questions;

import java.util.ArrayList;
//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/submissions/

class Kids_With_the_Greatest_Number_of_Candies {
    public ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> fun=new ArrayList<Boolean>();
        int maxcand=maxcandies(candies);
        for(int j=0;j<candies.length;j++){
            int sum=candies[j]+extraCandies;
            
            if(sum>=maxcand){
                fun.add(true);
            }
            else{
                fun.add(false);
            }
        }
         return fun;
        
        
        
        
    }
    int maxcandies(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}