package com.Java_DSA_Assignments.First_Java_Solution;

import java.util.Scanner;

public class FirstJava_Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String word = input.next();

        int start = 0;
        int end = word.length() - 1;


        while(start < end) {
            if(word.charAt(start) != word.charAt(end)) {
                System.out.println("Not a palindrome");
                return;
            }
            ++start;
            --end;
        }
        System.out.println("Palindrome");
    }
}
