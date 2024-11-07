package com.binarysearch;

// Leet code
// https://leetcode.com/problems/find-peak-element/description/
// Find the peak element in an array
public class PeakElement {
    public static void main(String[] args) {
        //peak element is 6 or 2
        int[] nums = {1,2,1,3,5,6,4};
        int res = findPeak(nums);
        System.out.println(res);// 6 is a peak element and it's index is 5, so 5 is returned
    }

    static int findPeak(int[] nums){
        int start = 0;
        int end = nums.length-1;

        while(start < end){
            int mid = (start+end)/2;
            if(nums[mid]>nums[mid+1]){
                end=mid;
            }else {
                start=mid+1;
            }
        }
        return start;
    }
}
