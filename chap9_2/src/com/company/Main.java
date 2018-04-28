package com.company;
import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean loopEnd = true;
        String numbers;
        int[] intArray = new int[2];
        int result = 0;
        int n1 = 0, n2 = 0;

        System.out.println("Enter two numbers. Please leave a space between the numbers. I will compute the ratio.");
        while (loopEnd) {
            numbers = in.nextLine();
            String[] numArray = numbers.split(" ");
            for (int i = 0; i <2; i++) {
                try {
                    intArray[i] = Integer.parseInt(numArray[i]);
                } catch (NumberFormatException e) {
                    System.out.println("Please enter only integers...");
                }
            }
            n1 = intArray[0];
            n2 = intArray[1];
            try {
                result = n1 / n2;
            }catch (ArithmeticException e){
                System.out.println("Cannot divide by zero... Please try again.");
            }
            if((n1 == 0) || (n2 == 0)){
                continue;
            }else{
                break;
            }

        }
        System.out.println("The ratio r = " + result);
    }
}
