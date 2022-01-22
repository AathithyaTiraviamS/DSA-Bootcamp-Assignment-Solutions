package com.Java_DSA_Assignments.Conditionals_and_Loops_Solution;

import java.util.Scanner;

//Find if a number is palindrome is or not
public class NumPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int num2 = num;
        int rev = 0;

        while (num > 0) {
            int rem = num%10;
            rev = rev*10 + rem;
            num = num/10;
        }
        if(num2 == rev) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }
    }
}
