package com.binarysearch;

//Order Agnostic means array can be sorted in descending or asending it will search for both the cases
public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {89,78,34,22,19, 12, 10, 2};
        //int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        int target = 34;
        int res = search(arr, target);
        System.out.println(res);
    }

    static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        boolean isASCending = arr[start]<arr[end];

        while(start<=end){
            int mid = (start+end)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(isASCending==true){
                if(target<arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
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
}
