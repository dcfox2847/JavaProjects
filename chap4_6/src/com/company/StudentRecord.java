package com.company;

public class StudentRecord {

    public static double averageQuiz(int quizA, int quizB, int quizC) {
        return (quizA + quizB + quizC) / 3;
    }

    public static double averageQuizWeighted(double quizAverage){
        return quizAverage * .25;
    }

    public static double midtermWeighted(double midterm){
        return midterm * .35;
    }

    public static double finalWeighted(double finalTest){
        return finalTest * .40;
    }

    public static double totalWeighted(double a, double b, double c){
        return a + b + c;
    }

    public static int pointsPossible( int a, int b, int c, int d, int e){return a + b + c + d + e;}

    public static double overallGrade(double a, double b){return a - b;}

    public static String letterGrade(double finalScore){
        if(finalScore >= 90){
            return "A";
        }else if (finalScore >= 80 && finalScore < 90){
            return "B";
        }else if (finalScore >= 70 && finalScore < 80){
            return "C";
        }else if (finalScore >= 60 && finalScore < 70){
            return "D";
        }else{
            return "F";
        }
    }

}
