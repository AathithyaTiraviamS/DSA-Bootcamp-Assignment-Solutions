package com.Java_DSA_Assignments.Functions;

import java.util.Scanner;

public class Func_Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        System.out.println(productOfTwoNumbers(num1 ,num2));
    }

    private static double productOfTwoNumbers(double a, double b) {
        return a*b;
    }
}
