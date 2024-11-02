package com.arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,3,23,9,18,89};
        System.out.println(Arrays.toString(reverseArray(arr)));
    }

    static int[] reverseArray(int[] a){
        int end = a.length-1;
        for(int start=0;start<end;start++){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            end--;
        }
        return a;
    }
}
