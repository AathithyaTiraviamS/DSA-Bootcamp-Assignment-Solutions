package com.Java_DSA_Assignments.Conditionals_and_Loops_Solution;

import java.util.Scanner;

//Reverse A String in java
public class Intermediate_Q17 {
    public static void main(String[] args) {
       Scanner input =new Scanner(System.in);

        System.out.print("Enter a string: ");
       String word = input.nextLine();
       String rev = "";

       for(int i = word.length()-1; i >= 0; --i) {
           rev += word.charAt(i);
       }
        System.out.println(rev);
    }
}
