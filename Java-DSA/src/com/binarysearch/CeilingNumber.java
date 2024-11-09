package com.binarysearch;

// if the array is sorted then we can apply binary search
//ceiling of a number means if the target element which is equal or immediate greater than that nunber.
//ex:- arr=[2, 3, 5, 9, 14, 16, 19] target=15
//in the above example 15 is not there so, immediate greater of 15 is 16, 16 is the ceiling number
public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 19};
        int target = 15;
        int res = ceiling(arr, target);
        System.out.println(res);
    }

    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            int mid = (start+end)/2;
            if(target == arr[mid]){
                return arr[mid];
            }else if(target < arr[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return arr[start];
    }
}
