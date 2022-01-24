package com.Java_DSA_Assignments.Functions;

import java.util.Scanner;

public class Func_Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        if (isEligible(age)) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not Eligible to vote");
        }
    }

    private static boolean isEligible(int a) {
        return a >= 18;
    }
}
