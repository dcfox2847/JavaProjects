package com.company;

public class PlaneSeat {

    public static boolean isFilled(char[][] plane){
        for(int i = 0; i < plane.length; i++){
            for(int j = 0; j < plane[0].length; j++){
                if(plane[i][j] !='X')
                    return false;
            }
        }
        return true;
    }

    public static int getRowNumber(String seatNumber){
        char rowChar = seatNumber.charAt(0);
        return (int)rowChar - 48 - 1;
    }
    public static int getColumnNumber(String seatNumber){
        char columnChar = seatNumber.charAt(1);
        if(columnChar == 'A')
            return 0;
        else if(columnChar == 'B')
            return 1;
        else if(columnChar == 'C')
            return 2;
        else if(columnChar == 'D')
            return 3;
        else
            return -1;
    }

    public static void printPlane(char[][] plane){
        for(int i = 0; i < plane.length; i++){
            System.out.print((i + 1) + " ");
            for(int j = 0; j < plane[0].length; j++){
                System.out.print(plane[i][j] + " ");
                if(j == 1)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

}
