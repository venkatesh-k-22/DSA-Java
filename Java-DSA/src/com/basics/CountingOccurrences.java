package com.basics;

import java.util.Scanner;

public class CountingOccurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number n");
        int n = input.nextInt();
        int target = 7;
        System.out.println(countOccurences(n,target));
    }
    static int countOccurences(int n, int target){
        int count = 0;
        while(n>0){
            int rem = n%10;
            if(rem == target){
                count++;
            }
            n/=10;
        }
        return count;
    }
}
