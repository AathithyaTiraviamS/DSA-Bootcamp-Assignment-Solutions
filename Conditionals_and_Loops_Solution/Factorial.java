package com.Java_DSA_Assignments.Conditionals_and_Loops_Solution;

import java.util.Scanner;

//Factorial program in java
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        if  (num == 0) {
            System.out.println(1);
            return;
        }
        if (num < 0) {
            System.out.println("Enter valid number");
            return;
        }
        long fact = 1;
        while(num > 0) {
            fact *= num;
            --num;
        }
        System.out.println(fact);
    }
}
