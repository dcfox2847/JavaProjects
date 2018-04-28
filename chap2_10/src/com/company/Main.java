package com.company;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("IT-2650 Java Programming");
        System.out.println("Student Name: Daniel Fox");
        System.out.println("Homework Assignment: Chapter 2, Problem 2-10");
        System.out.println(" _________________________________ ");
        System.out.println("");

        Scanner inI = new Scanner(System.in);
        Scanner inQ = new Scanner(System.in);
        Scanner inP = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Name of Item 1: ");
        String item1 = inI.nextLine();
        System.out.println("Quantity of item 1: ");
        int item1Q = inQ.nextInt();
        System.out.println("Price of item 1: ");
        double item1P = inP.nextDouble();
        System.out.println("Name of Item 2: ");
        String item2 = inI.nextLine();
        System.out.println("Quantity of item 2: ");
        int item2Q = inQ.nextInt();
        System.out.println("Price of item 2: ");
        double item2P = inP.nextDouble();
        System.out.println("name of item 3: ");
        String item3 = inI.nextLine();
        System.out.println("Quantity of Item 2: ");
        int item3Q = inQ.nextInt();
        System.out.println("Price of item 3: ");
        double item3P = inP.nextDouble();

        double item1T = item1P * item1Q;
        double item2T = item2P * item2Q;
        double item3T = item3P * item3Q;

        System.out.println("---------- Invoice ----------");
        System.out.println(String.format("%-30s %-10s %-10s %-10s", "Item", "Quantity", "Price", "Total"));
        System.out.println(String.format("%-30s %-10s %-10s %-10s", item1, item1Q, item1P, "$" + df.format(item1T)));
        System.out.println(String.format("%-30s %-10s %-10s %-10s", item2, item2Q, item2P, "$" + df.format(item2T)));
        System.out.println(String.format("%-30s %-10s %-10s %-10s", item3, item3Q, item3P, "$" + df.format(item3T)));

        double subTotal = item1T + item2T + item3T;
        double tax = subTotal * .625;
        double grandTotatl = subTotal + tax;

        System.out.println(String.format("%-30s %-10s %-10s %-10s", "SubTotal", "", "", "$" + df.format(subTotal)));
        System.out.println(String.format("%-30s %-10s %-10s %-10s", "6.25% Sales Tax", "", "", "$" + df.format(tax)));
        System.out.println(String.format("%-30s %-10s %-10s %-10s", "Total", "", "", "$" + df.format(grandTotatl)));



    }
}
