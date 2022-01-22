package com.Java_DSA_Assignments.Conditionals_and_Loops_Solution;

import java.util.Scanner;

//print all the factors of a number
public class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if (num <= 1) {
            System.out.println("neither prime nor composite");
            return;
        }
        System.out.print(1);
        int c = 2;
        while (c * c <= num) {
            if (num % c == 0) {
                if (c * c == num) {
                    System.out.print("," + c);
                } else {
                    System.out.print("," + c + "," + num / c);
                }
            }
            ++c;
        }
        System.out.println("," + num);
    }
}