package com.company;
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
        System.out.println("Homework Assignment: Chapter 2, Problem 2-3");
        System.out.println(" _________________________________ ");
        System.out.println("");

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter a first number: ");
        int numA = in.nextInt();
        System.out.println("Please enter a second number: ");
        int numB = in.nextInt();

        int numAdd = numA + numB;
        int numSub = numA - numB;
        int numMul = numA * numB;

        System.out.println("By adding " + numA + " and " + numB + " you get, " + numAdd + ".");
        System.out.println("By subtracting " + numA + " and " + numB + " you get, " + numSub + ".");
        System.out.println("By multiplying " + numA + " and " + numB + " you get, " + numMul + ".");

    }
}
