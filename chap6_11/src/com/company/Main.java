package com.company;
import java.util.Scanner;

import static com.company.PlaneSeat.*;

public class Main {

    public static void main(String[] args) {

        char[][] plane = {
                {'A', 'B', 'C', 'D'},
                {'A', 'B', 'C', 'D'},
                {'A', 'B', 'C', 'D'},
                {'A', 'B', 'C', 'D'},
                {'A', 'B', 'C', 'D'},
                {'A', 'B', 'C', 'D'},
                {'A', 'B', 'C', 'D'},
        };

        Scanner in = new Scanner(System.in);
        String decision = "y";

        while(decision.equalsIgnoreCase("y") && !isFilled(plane)){
            printPlane(plane);
            System.out.print("Enter a plane seat to fill: ");
            boolean okSeat = false;
            while(okSeat == false){
                String seat = in.nextLine();
                int r = getRowNumber(seat);
                int c = getColumnNumber(seat);
                if(plane[r][c] == 'X')
                    System.out.print("Sorry, the seat is occupied, enter a different seat.");
                else{
                    plane[r][c] = 'X';
                    okSeat = true;
                }
            }
            System.out.print("Continue filling seats? (y/n)");
            decision = in.nextLine();
        }
        System.out.println("Plane Seating chart: ");
        printPlane(plane);
    }
}
