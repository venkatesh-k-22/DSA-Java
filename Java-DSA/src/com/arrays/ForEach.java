package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ForEach {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner input = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i] = input.nextInt();
        }

        //print the array values using enhanced for-each loop
        for(int i:arr){
            System.out.println(i+" ");
        }

        //in java toString() method is also help to print the values inside the array
        System.out.println(Arrays.toString(arr));// it internally uses for loop

    }
}
