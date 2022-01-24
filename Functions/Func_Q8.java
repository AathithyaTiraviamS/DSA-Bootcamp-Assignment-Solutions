package com.Java_DSA_Assignments.Functions;

import java.util.Scanner;

public class Func_Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = input.nextInt();
        displayGrades(marks);
    }

    private static void displayGrades(int m) {
        String grade;
        if ((m >= 91) && (m <= 100)) {
            grade = "AA";
        } else if((m >= 81) && (m <= 90)) {
            grade = "AB";
        } else if((m >= 71) && (m <= 80)) {
            grade = "BB";
        } else if((m >= 61) && (m <= 70)) {
            grade = "BC";
        } else if((m >= 51) && (m <= 60)) {
            grade = "CD";
        } else if((m >= 41) && (m <= 50)) {
            grade = "DD";
        } else if(m <= 40) {
            grade = "Fail";
        } else {
            grade = "Marks cannot be greater than 100";
        }
        System.out.println(grade);
    }
}
