package com.Part1;

public class Fibinachi {
//Only small numbers

    public static void main(String[] args) {
        System.out.println(finbonachii(4));

    }
    static int finbonachii(int n){
        if(n==0 || n==1){
            return n;
        }

        else{
            return finbonachii(n-1)+finbonachii(n-2);
        }
    }

}
