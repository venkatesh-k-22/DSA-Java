package com.linearsearch;

// https://leetcode.com/problems/richest-customer-wealth/description/

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 5},
                {7, 3},
                {3, 5}
        };
        int res = findWealth(arr);
        System.out.println(res);
    }

    static int findWealth(int[][] accounts){
        int max = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int wealth = 0;
            for (int i : account) {
                wealth += i;
            }
            if (wealth > max) {
                max = wealth;
            }
        }
        return max;
    }
}
