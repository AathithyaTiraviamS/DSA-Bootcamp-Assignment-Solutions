package com.Java_DSA_Assignments.Functions;

import java.util.Scanner;

public class Func_Q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if(isPythagorean(num1, num2, num3)) {
            System.out.println("Pythagorean triplet");
        } else {
            System.out.println("Not a pythagorean triplet");
        }
    }

    private static boolean isPythagorean(int a, int b, int c) {
        boolean ans = false;
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
        if (max == a) {
            if (a*a == b*b + c*c) {
                ans = true;
            }
        }
        if (max == b) {
            if(b*b == a*a + c*c) {
                ans = true;
            }
        }
        if (max == c) {
            if(c*c == b*b + a*a) {
                ans = true;
            }
        }
        return ans;
    }
}
