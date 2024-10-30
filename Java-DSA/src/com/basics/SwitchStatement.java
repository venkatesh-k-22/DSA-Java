package com.basics;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a fruit");
        String fruit = input.next();

        switch(fruit){
            case "Apple":
                System.out.println("Apple is red fruit");
                break;
            case "Orange":
                System.out.println("Orange fruit is Round");
                break;
            case "Mango":
                System.out.println("Mango is king in fruits");
                break;
            default:
                System.out.println("Please enter a valid fruit");
        }
    }
}
