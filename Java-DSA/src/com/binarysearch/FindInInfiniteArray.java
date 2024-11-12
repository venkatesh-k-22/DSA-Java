package com.binarysearch;

//if we don't know the size of the array
//find start and end index
public class FindInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 7, 8, 10, 11, 12, 15, 20, 23, 30, 32};
        int target = 30;
        int start=0;
        int end=1;
        while(target>arr[end]){
            int newStart = end+1;
            end = end+(end-start+1)*2;
            start = newStart;
        }
        int ans = binarySearch(arr, target, start, end);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid=(start+end)/2;
            if(target == arr[mid]){
                return mid;
            } else if (target < arr[mid]) {
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
}
