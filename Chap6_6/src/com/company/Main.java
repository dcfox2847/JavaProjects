package com.company;
import java.util.Scanner;

import static com.company.SortedCount.isInArray;
import static com.company.SortedCount.search;
import static com.company.SortedCount.sort;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[50];
        int[] occurences = new int[50];
        int size;

        System.out.println("How many numbers to enter?  (At most 50)");
        size = scan.nextInt();
        System.out.println("Please enter each of the " + size + " numbers. Please put a space between each number.");
        String arrayString = in.nextLine();
        scan = new Scanner(arrayString);
        while(scan.hasNextInt()){
            int nextNumber = scan.nextInt();
            if(!isInArray(numbers, size, nextNumber)){
                numbers[size] = nextNumber;
                occurences[size] = 1;
                size++;
            }else{
                int index = search(numbers, size, nextNumber);
                occurences[index]++;
            }
        }
        sort(numbers, occurences, size);
        System.out.println("N\tCount");
        for(int i = 0; i < arrayString.length(); i++){
            System.out.println(numbers[i] + "\t" + occurences[i]);
        }


    }
}
