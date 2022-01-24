package com.Java_DSA_Assignments.Functions;

import java.util.Scanner;

public class Func_Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        Factorial(num);
    }

    private static void Factorial(int n) {
        if  (n == 0) {
            System.out.println(1);
            return;
        }
        if (n < 0) {
            System.out.println("Enter valid number");
            return;
        }
        long fact = 1;
        while(n > 0) {
            fact *= n;
            --n;
        }
        System.out.println(fact);
    }
}

