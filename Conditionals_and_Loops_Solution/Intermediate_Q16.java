package com.Java_DSA_Assignments.Conditionals_and_Loops_Solution;

import java.util.Scanner;

//Find Ncr and Npr
public class Intermediate_Q16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter N and r(N>r): ");

        int n = input.nextInt();
        int r = input.nextInt();

        if(n < r) {
            return;
        }
        long nFact = factorial(n);
        long rFact = factorial(r);
        long nrFact = factorial(n-r);

        System.out.println("Ncr: " + (nFact/(rFact*nrFact)));
        System.out.println("Npr: " + (nFact/nrFact));

    }

    public static int factorial(int n){
        if  (n == 0) {
            return 1;
        }
        if (n < 0) {
            return -1;
        }
        int fact = 1;
        while(n > 0){
            fact *= n;
            --n;
        }
        return fact;
    }
}
