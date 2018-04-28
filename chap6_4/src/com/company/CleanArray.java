package com.company;

public class CleanArray {

    public static int deleteRepeats(char arr[]) {
        int size = arr.length;
        for (int i = 0; i < size; i++){
            for (int j = i + 1; j < size; j++) {
                if(arr[i] == arr[j]){
                    for (int k = j; k < size - 1; k++) {
                        arr[k] = arr[k + 1];
                    }
                    size--;
                    j--;
                }
            }
        }
        return size;
    }

    public static void printNewArray(char[] arr){
        int size = CleanArray.deleteRepeats(arr);
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.print("\n");
    }


}