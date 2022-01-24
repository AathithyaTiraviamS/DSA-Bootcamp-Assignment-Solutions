package com.Java_DSA_Assignments.Functions;

import java.util.Scanner;

public class Func_Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if(isPalindrome(num)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }
    }

    private static boolean isPalindrome(int n) {
        int num = n;
        int rev = 0;

        while (n > 0) {
            int rem = n%10;
            rev = rev*10 + rem;
            n = n/10;
        }

        return rev == num;
    }
}
