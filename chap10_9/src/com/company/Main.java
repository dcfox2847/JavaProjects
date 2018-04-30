package com.company;
import java.io.*;

public class Main {

    public static void main(String[] args) {

        int numTotal = 0, average = 0, count = 0;

        try{
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Daniel\\IdeaProjects\\chap10_9\\src\\com\\company\\numbers.dat"));
            for (int i = 0; i < 10; i++){
                int number = (int)(Math.random() * 20) + 1;
                System.out.println(number);
                outputStream.writeInt(number);
            }
            outputStream.close();
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\Daniel\\IdeaProjects\\chap10_9\\src\\com\\company\\numbers.dat"));
            int minInt = 20, maxInt = 0;
            try {
                while(true){
                    int nextInt = inputStream.readInt();

                    if(nextInt < minInt){
                        minInt = nextInt;
                    }
                    if(nextInt > maxInt){
                        maxInt = nextInt;
                    }
                    numTotal = numTotal + nextInt;
                    count++;
                }
            }catch (IOException ioe){
                average = numTotal/count;
                System.out.println("Grand Total: " + numTotal);
                System.out.println("Count: " + count);
                System.out.println("Average: " + average);
                System.out.println("Max: " + maxInt);
                System.out.println("Min: " + minInt);
            }
        }catch (IOException ioe){
            System.out.println("Eror with the file output....");
        }

    }
}
