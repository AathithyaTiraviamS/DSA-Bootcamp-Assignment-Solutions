package com.Java_DSA_Assignments.First_Java_Solution;

import java.util.Scanner;

public class FirstJava_Q1 {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = input.nextInt();

    if (num % 2 == 0) {
        System.out.println(num + " is even");
    }
    else {
        System.out.println(num + " is odd" );
    }
    }
}
