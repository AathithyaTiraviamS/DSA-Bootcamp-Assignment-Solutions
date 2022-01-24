package com.Java_DSA_Assignments.Functions;

import java.util.Scanner;

public class Func_Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = input.nextDouble();
        circumferenceArea(radius);
    }

    private static void circumferenceArea(double r) {
        double circumference = 2*Math.PI*r;
        double area = Math.PI*r*r;
        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);
    }
}
