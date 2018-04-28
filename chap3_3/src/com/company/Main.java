package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner quit = new Scanner(System.in);
        int gender = 2, momFeet, momInches, dadFeet, dadInches;
        int childTotalInches, childFeet = 0, childInches = 0;
        boolean genderLoop = false;
        String endAnswer = "Y";

        while(endAnswer.equalsIgnoreCase("Y")) {

            System.out.println("Enter the gender of your future child." +
                    " Use 1 for female, or 0 for male.");
            while (!genderLoop) {
                gender = input.nextInt();
                if ((gender == 0) || (gender == 1)) {
                    genderLoop = true;
                } else {
                    System.out.println("Please enter a 0 for male " +
                            "or a 1 for female");
                }
            }
            System.out.println("Enter the height in feet, then the " +
                    "height in inches of the mother.");
            System.out.println("Mothers height in feet: ");
            momFeet = input.nextInt();
            System.out.println("Inches after feet in height of mother: ");
            momInches = input.nextInt();
            System.out.println("Enter the height in feet, then the " +
                    "height in inches of the dad: ");
            System.out.println("Fathers height in feet: ");
            dadFeet = input.nextInt();
            System.out.println("Inches after feet in height of fatehr: ");
            dadInches = input.nextInt();

            int dadTotalInches = ((dadFeet * 12) + dadInches);
            int momTotalInches = ((momFeet * 12) + momInches);

            if (gender == 1) {
                childTotalInches = (dadTotalInches * 12 / 13 + momTotalInches) / 2;
                childFeet = childTotalInches / 12;
                childInches = childTotalInches % 12;
            } else if (gender == 0) {
                childTotalInches = (momTotalInches * 13 / 12 + dadTotalInches) / 2;
                childFeet = childTotalInches / 12;
                childInches = childTotalInches % 12;
            } else {
                System.out.println("Not working.....");
            }

            System.out.println("Your future child is estimated to grow to " +
                    childFeet + " feet and " + childInches + " inches.");

            System.out.println("Enter 'Y' to run again, " +
                    "or enter anything else to exit.");
            endAnswer = quit.nextLine();
            if (endAnswer.equalsIgnoreCase("y")){
                genderLoop = false;
            }else{
                System.out.println("Goodbye!");
            }

        }
    }
}
