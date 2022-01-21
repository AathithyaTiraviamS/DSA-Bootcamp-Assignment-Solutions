package com.Java_DSA_Assignments;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number upto which you want to print the series: ");
        int n = input.nextInt();

        int a = 0;
        int b = 1;
        int c = 2;
        System.out.print(a + " " + b + " ");
        while(c < n) {
            int temp = b;
            b = b + a;
            System.out.print(b + " ");
            a = temp;
            ++c;
        }
    }
}
