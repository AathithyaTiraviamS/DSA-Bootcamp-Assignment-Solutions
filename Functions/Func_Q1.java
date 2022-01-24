package com.Java_DSA_Assignments.Functions;

import java.util.Scanner;

public class Func_Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        maxNum(num1, num2, num3);
        minNum(num1, num2, num3);
    }

    private static void minNum(int a, int b, int c) {
        int min = Integer.MAX_VALUE;
        if(a < min) {
            min = a;
        }
        if(b < min) {
            min = b;
        }
        if(c < min) {

            min = c;
        }
        System.out.println("Minimum value is: " + min);
    }

    private static void maxNum(int a, int b, int c) {
        int max = Integer.MIN_VALUE;
        if(a > max) {
            max = a;
        }
        if(b > max) {
            max = b;
        }
        if(c > max) {
            max = c;
        }
        System.out.println("Maximum value is: " + max);
    }


}
