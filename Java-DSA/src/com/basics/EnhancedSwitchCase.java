package com.basics;

import java.util.Scanner;

public class EnhancedSwitchCase {
    public static void main(String[] args) {
        Scanner inmput = new Scanner(System.in);
        System.out.println("Enter a fruit");
        String fruit = inmput.next();

        switch (fruit) {
            case "Apple" -> System.out.println("Apple is red fruit");
            case "Orange" -> System.out.println("Orange fruit is Round");
            case "Mango" -> System.out.println("Mango is king in fruits");
            default -> System.out.println("Please enter a valid fruit");
        }
    }
}
