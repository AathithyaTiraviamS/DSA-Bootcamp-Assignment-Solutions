package com.Java_DSA_Assignments.Functions;

import java.util.Scanner;

public class Func_Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        if (isEven(num)) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    private static boolean isEven(int a) {
        return a%2 == 0;
    }
}
