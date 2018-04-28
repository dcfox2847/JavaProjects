package com.company;
import java.util.Date;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Timer {
    // Local Variables
    public long startTime, endTime;
    private int a, b;
    private double resultAdd, resultMultiply;

    //Getters and Setters
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    // Formatting
    NumberFormat nf = new DecimalFormat("##.0000");
    Date date = new Date();

    // Methods
    public long whileLoop(int a, int b) {
        this.a = a;
        this.b = b;
        int count = 0;
        startTime = date.getTime();
        while (count < 10000001) {
            resultAdd = a + b;
            resultMultiply = a * b;
            count++;
        }
        endTime = date.getTime();
        return endTime - startTime / 1000;
    }
}
