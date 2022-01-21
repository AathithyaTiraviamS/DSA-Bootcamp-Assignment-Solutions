package com.Java_DSA_Assignments.First_Java_Solution;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        String message = "Hello " + name;
        System.out.println(message);
    }
}
