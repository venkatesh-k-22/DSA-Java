package com.linearsearch;

public class MinimumNumber {
    public static void main(String[] args) {
        int[] arr = {18, 12, 9, 14, 77, 50};
        int res = findMinimum(arr);
        System.out.println(res);
    }

    static int findMinimum(int[] arr){
        if(arr.length == 0){
            return Integer.MIN_VALUE;
        }
        int min = arr[0];
        for (int index = 1; index < arr.length; index++) {
            if(arr[index]<min){
                min = arr[index];
            }
        }
        return min;
    }
}
