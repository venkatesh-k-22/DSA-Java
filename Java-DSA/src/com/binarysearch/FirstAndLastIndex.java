package com.binarysearch;

import java.util.Arrays;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/1450726490/
//find the first occurence and last occurence of target value
public class FirstAndLastIndex {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 7, 7, 8, 8, 10};
        int target = 7;
        System.out.println(Arrays.toString(searchRange(arr,target)));
    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        int start = serach(nums, target,true);
        int end = serach(nums,target,false);
        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    static int serach(int[] nums, int target, boolean firstOccurence) {
        int ans = -1;

        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = (start+end)/2;
            if(target<nums[mid]){
                end = mid-1;
            }else if(target > nums[mid]){
                start = mid+1;
            }else{
                //potential answer found
                ans = mid;
                if(firstOccurence){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}
