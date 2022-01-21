package com.Java_DSA_Assignments.First_Java_Solution;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter principle amount: ");
        double principle = input.nextDouble();

        System.out.print("Enter rate of interest in percent: ");
        double rate = input.nextDouble();

        System.out.print("Enter time in years: ");
        double time = input.nextDouble();

        double simpleInterest = (principle*rate*time)/100;

        System.out.println("Simple Interest is: " + simpleInterest);
    }
}
