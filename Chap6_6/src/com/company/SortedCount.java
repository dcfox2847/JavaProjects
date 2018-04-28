package com.company;

public class SortedCount {

    public static void sort(int[] numbers, int[] occurences, int size) {
        for (int current = 0; current < size; current++) {
            int max = current;
            for (int i = current; i < size; i++) {
                if (numbers[i] > numbers[max]) {
                    max = i;
                }
                int temp = numbers[max];
                numbers[max] = numbers[current];
                numbers[current] = temp;
                temp = occurences[max];
                occurences[max] = occurences[current];
                occurences[current] = temp;
            }
        }

    }

    public static int search(int[] array, int size, int number) {
        for (int i = 0; i < size; i++) {
            if (array[i] == number)
                return i;
        }
        return -1;
    }

    public static boolean isInArray(int[] array, int size, int number){
        for(int i = 0; i < size; i++){
            if(array[i] == number)
                return true;
        }
        return false;
    }
}
