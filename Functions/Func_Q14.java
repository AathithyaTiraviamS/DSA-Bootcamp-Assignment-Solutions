package com.Java_DSA_Assignments.Functions;

import java.util.Scanner;

public class Func_Q14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = input.nextInt();
        int sum = sumOfNaturalNumbers(n);
        System.out.println(sum);
    }

    private static int sumOfNaturalNumbers(int n) {
        return n*(n+1)/2;
    }
}
