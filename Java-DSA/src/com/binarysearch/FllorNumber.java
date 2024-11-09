package com.binarysearch;

// if the array is sorted then we can apply binary search
//flooring of a number means if the target element which is equal or immediate less than that nunber.
//ex:- arr=[2, 3, 5, 9, 14, 16, 19] target=15
//in the above example 15 is not there so, immediate smallest of 15 is 14, 14 is the floor number
public class FllorNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 19};
        int target = 15;
        int res = floorNumber(arr, target);
        System.out.println(res);
    }

    static int floorNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = (start+end)/2;
            if(target == arr[mid]){
                return arr[mid];
            } else if (target < arr[mid]) {
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return arr[end];
    }
}
