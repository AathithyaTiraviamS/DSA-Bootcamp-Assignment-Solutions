package com.Java_DSA_Assignments.Conditionals_and_Loops_Solution;

import java.util.Scanner;

//Perfect number in java
public class Intermediate_Q23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if (num == 1) {
            System.out.println(1);
            return;
        }

        int sum = 0;

        int c = 2;
        while (c * c <= num) {
            if (num % c == 0) {
                if (c * c == num) {
                    sum += c;
                } else {
                    sum = sum + c + num/c;
                }
            }
            ++c;
        }
        sum = sum + 1;
        if(sum == num){
            System.out.println("Perfect Number");
        }
        else {
            System.out.println("Not a perfect number");
        }
    }
}
