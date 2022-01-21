package com.Java_DSA_Assignments;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the currency in rupees: ");
        double inr = input.nextDouble();

        double usd = 74.54*inr;
        System.out.println(usd);
    }
}
