package com.Java_DSA_Assignments.Functions;

import java.util.Scanner;

public class Func_Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        sumOfTwoNumbers(num1 ,num2);
    }

    private static void sumOfTwoNumbers(double a, double b) {
        double sum = a + b;
        System.out.println(sum);
    }
}
