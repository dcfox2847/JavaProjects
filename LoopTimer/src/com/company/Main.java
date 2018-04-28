package com.company;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        System.out.println("Average Elapsed Time for 10,000,000 loops in seconds: ");
        System.out.println("___________________________________________");
        Timer timer = new Timer();
        System.out.println(timer.whileLoop(5, 4));



    }
}
