package com.Java_DSA_Assignments.Conditionals_and_Loops_Solution;

import java.util.Scanner;

public class SumOfNegativePositiveOddPositiveEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long sumNegative = 0;
        long sumEven = 0;
        long sumOdd = 0;

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        while(num != 0) {
            if(num < 0){
                sumNegative += num;
            }
            else {
                if(num % 2 == 0){
                    sumEven += num;
                } else {
                    sumOdd += num;
                }
            }
            System.out.print("Enter a number: ");
            num = input.nextInt();
        }
        System.out.println("sum of Negative Numbers: " + sumNegative);
        System.out.println("sum of Positive Odd Numbers: " + sumOdd);
        System.out.println("sum of Positive Even Numbers: " + sumEven);
    }
}
