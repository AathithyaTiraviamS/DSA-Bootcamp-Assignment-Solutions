package com.Java_DSA_Assignments.First_Java_Solution;

import java.util.Scanner;

public class FirstJava_Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int num2 = num;
        int sum = 0;

        while (num > 0) {
            int rem = num%10;
            sum = sum + rem*rem*rem;
            num = num/10;
        }
        if (sum == num2) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not a armstrong number");
        }

    }
}
