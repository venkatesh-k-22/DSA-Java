package com.linearsearch;

public class SearchInRange {
    public static void main(String[] args) {
        //Search an element the given range(1,4)  
        int[] arr = {18, 12, -7, 3, 14, 28};
        int target = 3;
        int start = 1;
        int end = 4;
        int res = searchInRange(arr, target, start, end);
        System.out.println(res);
    }

    static int searchInRange(int[] arr, int target, int start, int end){
        for (int index = start; index <=end ; index++) {
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
}
