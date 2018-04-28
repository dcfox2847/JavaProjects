package com.company;
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * IT-2650 Java Programming, Spring 2018
 * Instructor: Martin P. Walsh
 * Student Name: Daniel Fox
 * Homework Assignment: Chap 2, Problem 11
 * Purpose of Assignment: To have user enter 3 assignments, total the points earned/possible, and give a
 * percentage of points secured.
 */

public class Main {

    public static void main(String[] args) {


        System.out.println("IT-2650 Java Programming");
        System.out.println("Student Name: Daniel Fox");
        System.out.println("Homework Assignment: Chapter 2, Problem 2-11");
        System.out.println(" _________________________________ ");
        System.out.println("");

        Scanner inString = new Scanner(System.in);
        Scanner inInt = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("##.##");

        String[] exercise = new String[3];
        int[] score = new int[3];
        int[] total = new int[3];

        for (int i = 0; i < 3; i++) {

            System.out.println("Name of exercise " + (i + 1) + ": ");
            exercise[i] = inString.nextLine();
            System.out.println("Score received for exercise " +(i + 1) + ": ");
            score[i] = inInt.nextInt();
            System.out.println("Total points possible for exercise " + (i + 1) + ": ");
            total[i] = inInt.nextInt();

        }

        System.out.printf("%-30s %-15s %-20s\n", "Exercise", "Score", "Total Possible");
        System.out.printf("%-30s %-15s %-20s\n", exercise[0], score[0], total[0]);
        System.out.printf("%-30s %-15s %-20s\n", exercise[1], score[1], total[1]);
        System.out.printf("%-30s %-15s %-20s\n", exercise[2], score[2], total[2]);

        int totalScore = score[0] + score[1] + score[2];
        int totalPossible = total[0] + total[1] + total[2];
        double percent = ((double)totalScore / (double) totalPossible) * 100;
        System.out.printf("%-30s %-15s %-20s\n", "Total", totalScore, totalPossible);
        System.out.println("");
        System.out.print("Your total is " + totalScore + " out of " + totalPossible + ", or " + df.format(percent) + "% percent.");

    }
}
