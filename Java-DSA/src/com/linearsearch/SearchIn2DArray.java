package com.linearsearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 212, 173},
                {78, 18, 89},
                {77, 98, 18},
                {33, 21, 89, 88, 78}
        };
        int target = 18;
        int[] res = search(arr, target);
        System.out.println(Arrays.toString(res));
    }

    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                int element = arr[row][col];
                if(element == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
