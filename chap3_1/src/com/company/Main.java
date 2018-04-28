package com.company;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        int n;
        double r;
        double guess;
        double oldGuess;
        double answer;
        boolean endLoop = false;

        System.out.println("Please enter an integer to calculate the square root: ");
        n = input.nextInt();

        guess = n / 2;

        while(endLoop == false){
            r = n / guess;
            oldGuess = guess;
            guess = (guess + r) / 2;
            System.out.println(guess);
            if(Math.abs(oldGuess - guess) <= 0.01){
                endLoop = true;
            }else{
                answer = oldGuess;
                System.out.println("The estimated square root of 15 is " + df.format(answer));
                continue;
            }
        }

    }
}
