package com.Java_DSA_Assignments.Conditionals_and_Loops_Solution;

import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the largest number from all
public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        while (num != 0) {
            if(num > max) {
                max = num;
            }
            System.out.print("Enter an integer: ");
            num = input.nextInt();
        }
        System.out.println(max);
    }
}
