package com.arrays;

import java.util.Arrays;

public class SwapArray {
    public static void main(String[] args) {
        int[] arr = {1,3,23,9,18,89};
        System.out.println(Arrays.toString(swap(arr,0,3)));
    }

    static int[] swap(int[] arr, int index1, int index2){
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
            return arr;
    }
}
