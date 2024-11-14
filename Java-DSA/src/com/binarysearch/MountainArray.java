package com.binarysearch;

//https://leetcode.com/problems/find-in-mountain-array/description/
// 1. find the peak index
// 2. use agnostic binary search for both the orders first search in ascending order then in descending order
public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};//there is 2 3's here we need to return first 3's index
        int target = 3;
        int mountain = findInMountainArray(arr, target);
        System.out.println(mountain);

    }

    static int findInMountainArray(int[] arr, int target){
        int peakElement = findPeak(arr);
        int firstTry = orderAgnosticBinarySearch(arr, target, 0, peakElement);
        if(firstTry != -1){
            return firstTry;
        }
        return orderAgnosticBinarySearch(arr, target, peakElement+1, arr.length-1);
    }

    static int orderAgnosticBinarySearch(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start]<arr[end];
        while(start<=end){
            int mid = (start+end)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end=mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                if(target<arr[mid]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }

    static int findPeak(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = (start+end)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start; //you can return start or end bcz both are pointing to peak index
    }
}
