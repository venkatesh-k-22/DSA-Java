package com.basics;

import java.util.Scanner;

// Find the nth Fibonacci Series
public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a nth number");
        int n = input.nextInt();
        System.out.println(fibonacciNumber(n));
    }

    static int fibonacciNumber(int n){

        // Logic
        // a = 0 1 1 2 3 5 8 13.....
        // b = 1 1 2 3 5 8 13.....
        int count=2;
        int a=0;
        int b=1;
        while(count<=n){
            int temp=b;
            b=a+b;
            a=temp;
            count++;
        }
        return b;
    }
}
