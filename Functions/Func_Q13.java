package com.Java_DSA_Assignments.Functions;

import java.util.Scanner;

public class Func_Q13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        while (num1 <= num2) {
            if (isPrime(num1)) {
                System.out.print(num1 + " ");
            }
            ++num1;
        }
    }

    private static boolean isPrime(int n) {
        boolean ans = true;
        if (n <= 1) {
            ans = false;
        }
        int c = 2;
        while(c*c <= n) {
            if(n%c == 0) {
                ans = false;
                break;
            }
            ++c;
        }
        return ans;
    }
}
