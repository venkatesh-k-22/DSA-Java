package com.binarysearch;

//https://leetcode.com/problems/peak-index-in-a-mountain-array/
//duplicate is not allowed
public class PeakIndex {
    public static void main(String[] args) {
        int[] arr = {24, 69, 100, 99, 79, 78, 67, 36, 26, 19};
        System.out.println(peakIndexInMountainArray(arr));
    }
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<end){//we are not checking equals bcz that will be the result
            int mid = (start+end)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }else if(arr[mid]<arr[mid+1]){
                start = mid+1;
            }
        }
        return start;// we can return either start or end bcz both contains the peak index
    }
}
