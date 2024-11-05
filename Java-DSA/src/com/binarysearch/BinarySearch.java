package com.binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        int target = 36;
        int res = binarySearch(arr, target);
        System.out.println(res);
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int mid = (start+end)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(target<arr[mid]){
                end = mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}
