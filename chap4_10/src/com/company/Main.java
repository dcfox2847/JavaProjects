package com.company;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       Pet usersPet = new Pet("Jane Doe");
        DecimalFormat df = new DecimalFormat("#.###");
       System.out.println("My records on your pet are incomplete.");
       System.out.println("Here is what they currently say:");
       System.out.println(usersPet);

       Scanner keyboard = new Scanner(System.in);
       System.out.println("Please enter the pet's name:");
       String name = keyboard.nextLine();
       System.out.println("Please enter  the pet's type (dog or cat):");
       String type = keyboard.nextLine();
       System.out.println("Please enter the pet's age:");
       int age = keyboard.nextInt();
       System.out.println("Please enter the pet's weight:");
       double weight = keyboard.nextDouble();
       usersPet.set(name, type, age, weight);
       System.out.println("My records now say:");
       System.out.println(usersPet);
       System.out.println("Acepromazine needed: " + df.format(usersPet.acepromazine()) + "ml");
       System.out.println("Carprofen needed: " + df.format(usersPet.carprofen()) + "ml");
    }
}
