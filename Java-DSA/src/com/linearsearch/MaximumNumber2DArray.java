package com.linearsearch;

public class MaximumNumber2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 212, 173},
                {78, 18, 89},
                {77, 98, 18},
                {33, 21, 89, 88, 78}
        };
        int max = findMaximum(arr);
        System.out.println(max);
    }

    static int findMaximum(int[][] arr){
        int max = Integer.MIN_VALUE;

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
