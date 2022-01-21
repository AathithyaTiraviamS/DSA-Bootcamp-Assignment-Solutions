package com.Java_DSA_Assignments.First_Java_Solution;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        double num1 = input.nextDouble();

        System.out.println("Enter 2nd number: ");
        double num2 = input.nextDouble();

        double max = Double.MIN_VALUE;
        if(num1 > max) {
            max = num1;
        }
        if (num2 > max) {
            max = num2;
        }
        System.out.println("Largest of two numbers is: " + max);
    }
}
