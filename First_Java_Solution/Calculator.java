package com.Java_DSA_Assignments;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter 2nd number: ");
        double num2 = input.nextDouble();

        System.out.print("Enter a character: ");
        char op = input.next().charAt(0);

        double answer = 0;

        if (op == '+') {
               answer = num1 + num2;
        }

        if (op == '-') {
            answer = num1 - num2;
        }

        if (op == '*') {
            answer = num1 * num2;
        }

        if (op == '/') {
            if(num1 != 0) {
                answer = num1 / num2;
            }
        }
        System.out.println("Answer is: " + answer);
    }
}
