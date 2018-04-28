package com.company;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {

        PrintWriter outputStream = null;

        try
        {
            outputStream = new PrintWriter(new FileOutputStream("C:\\Users\\Daniel\\Desktop\\stuff.txt"));
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error opening the file stuff.txt");
            System.exit(0);
        }

        System.out.println("Writing to file.");
        outputStream.println("The quick brown fox");
        outputStream.println("jumps over the lazy dog.");
        outputStream.close();
        System.out.println("End of program.");

    }
}
