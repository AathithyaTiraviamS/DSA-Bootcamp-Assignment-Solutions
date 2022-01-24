package com.Java_DSA_Assignments.Conditionals_and_Loops_Solution;

import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the sum of all numbers
public class Basic_Q24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long sum = 0;
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        while (num != 0) {
            sum += num;
            System.out.print("Enter an integer: ");
            num = input.nextInt();
        }
        System.out.println(sum);
    }
}
