package com.linearsearch;

// Leet Code Problem - Find Numbers with Even Number of Digits
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenDigitArray {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        int res = findNumbers(arr);
        System.out.println(res);
    }
    public static int findNumbers(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            int element = nums[i];
            int count = (int)Math.log10(element)+1;

            if(count%2==0){
                res++;
            }
        }
        return res;
    }
}
