package com.teja;



public class t1 {
    public static void main(String[] args) {
        System.out.println(cap(3,4));

    }
    static int cap(int a,int b){
        System.out.println();
        return -1;

    }
}
// Q1;
// package com.teja;
//
//
//        import java.util.Scanner;
//
//public class t1 {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int inp=in.nextInt();
//        int c=0,i=1,j=1;
//        for(i=1;i<=inp;i++){
//            for(j=inp;j>=1;j--){
//                if(lcm(i,j)+gcd(i,j)==inp){
//                    c++;
//                    break;
//                }
//            }
//            if(c!=0){
//                break;
//            }
//        }
//        System.out.println(i +" ");
//        System.out.println(j);
//
//    }
//    static int lcm(int a,int b){
//        int max=a>b?a:b;
//        while(1==1){
//            if(max%a==0 && max%b==0){
//                break;
//            }
//            max++;
//        }
//        return max;
//
//    }
//    static int gcd(int a,int b){
//        int gcd=1;
//        for(int i=1;i<=a && i<=b;i++){
//            if(a%i==0 && b%i==0){
//                gcd=i;
//            }
//        }
//        return gcd;
//    }
//}


// Q2