package com.Java_DSA_Assignments.Conditionals_and_Loops_Solution;

import java.util.Scanner;

// Subtract the product and sum of digits of an integer
public class ProductAndSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = input.nextInt();

        int sum = 0;
        int product = 1;

        while(num > 0){
            int rem = num%10;
            sum += rem;
            product *= rem;
            num = num/10;
        }
        int difference = product - sum;
        System.out.println(difference);
    }
}
