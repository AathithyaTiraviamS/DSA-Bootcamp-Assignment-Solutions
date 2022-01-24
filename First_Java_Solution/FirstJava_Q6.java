package com.Java_DSA_Assignments.First_Java_Solution;

import java.util.Scanner;

public class FirstJava_Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the currency in rupees: ");
        double inr = input.nextDouble();

        double usd = 74.54*inr;
        System.out.println(usd);
    }
}
