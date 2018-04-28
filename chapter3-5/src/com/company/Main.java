package com.company;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner doubleIn = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Enter the house Purchase Cost: ");
        double cost = doubleIn.nextDouble();
        System.out.println("Enter the Down Payment: ");
        double downPayment = doubleIn.nextDouble();
        double houseCost = cost - downPayment;
        System.out.println("Enter the Interest Rate as a whole number" +
                " with two decimals: ");
        double interestRate = doubleIn.nextDouble() * 0.001;
        System.out.println("Enter the term in Months");
        int term = input.nextInt();
        double monthlyPayment = ((houseCost * interestRate) / (1 - Math.pow(1 + interestRate, - term)));

        System.out.println("The monthly payment is: $" + df.format(monthlyPayment));
        System.out.println(String.format("%-15s %-15s %-15s %-15s %-15s", "Month",
                "Monthly", "Interest", "Principal", "Remaining"));

        System.out.println((" "));System.out.println(String.format("%-15s %-15s %-15s %-15s %-15s", "Number",
                "Pymt", "Paid", "Paid", "Balance"));

        double interestPaid;
        double interestPaidTotal = (monthlyPayment * term) - houseCost;

        for(int i = 1; i <= term; i++){
            interestPaid = (monthlyPayment * term) - houseCost;
            double interestMonth = interestPaid / term;
            double principalMonth = monthlyPayment - interestMonth;
            System.out.println(String.format("%-15s %-15s %-15s %-15s %-15s", i,
                    df.format(monthlyPayment), df.format(interestMonth), df.format(principalMonth), df.format(houseCost)));
            houseCost = houseCost - monthlyPayment;
            interestPaidTotal = (monthlyPayment * term) - houseCost;
        }
        System.out.println("It will take you " + term + " months to pay off the house.");
        System.out.println("You will have paid " + interestPaidTotal + " in interest.");


    }
}
