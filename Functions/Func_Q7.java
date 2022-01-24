package com.Java_DSA_Assignments.Functions;

import java.util.Scanner;

public class Func_Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if (isPrime(num)) {
            System.out.println("Prime");
        } else {
            System.out.println("Not a prime");
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
