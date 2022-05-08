package ocm.Imp;

import java.util.Arrays;

public class Cyclic_Sort {
    public static void main(String[] args) {
        int[] arr={3,4,5,2,1,7,6,8,10,11,9,13,15,12,14};
        Insecrtion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Insecrtion(int[] arr){
        int i=0;
        while(i<arr.length){
            if(arr[i]==i+1){
                i++;
            }
            else{
                swap(arr,i,arr[i]-1);
            }

        }
    }
    static void swap(int[] arr,int first,int second){
        int tmp=arr[first];
        arr[first]=arr[second];
        arr[second]=tmp;
    }

}
