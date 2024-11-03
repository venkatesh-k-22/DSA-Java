package com.linearsearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {18, 12, 9, 14, 77, 50};
        int target = 14;
        int res = liearSearch(arr,target);
        System.out.println(res);
    }

    static int liearSearch(int[] arr, int target){
        //if array is empty then return -1
        if(arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length ; index++) {
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        //return -1 if the element is not found inside the array
        //Worst Cas Time Complexity is:- O(N)
        return -1;
    }
}
