package com.company;
        import java.text.DecimalFormat;
        import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        String letterGrade = "";
        int quizOne, quizTwo, quizThree, midterm, finalExam;
        double weightedQuiz, quizAverage, weightedMidterm, weightedFinalExam, totalWeightedScore, pointsTotal, pointsEarned;
        double pointsPossible = 230.00;
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("##.##");

        System.out.println("Enter the student's score on the first quiz:");
        quizOne = input.nextInt();
        System.out.println("Enter the student's score on the second quiz:");
        quizTwo = input.nextInt();
        System.out.println("Enter the student's score on the third quiz:");
        quizThree = input.nextInt();
        System.out.println("Enter the student's score on the midterm:");
        midterm = input.nextInt();
        System.out.println("Enter the student's score on the final:");
        finalExam = input.nextInt();

        quizAverage = StudentRecord.averageQuiz(quizOne, quizTwo, quizThree);
        weightedQuiz = StudentRecord.averageQuizWeighted(quizAverage);
        weightedMidterm = StudentRecord.midtermWeighted(midterm);
        weightedFinalExam = StudentRecord.finalWeighted(finalExam);
        totalWeightedScore = StudentRecord.totalWeighted(weightedQuiz, weightedMidterm, weightedFinalExam);
        pointsTotal = StudentRecord.pointsPossible(quizOne, quizTwo, quizThree, midterm, finalExam);
        pointsEarned = StudentRecord.overallGrade(pointsPossible, pointsTotal);
        letterGrade = StudentRecord.letterGrade(pointsEarned);


        System.out.println("Student Record: ");
        System.out.println("Quiz 1: " + quizOne + " Quiz 2: " + quizTwo + " Quiz 3: " + quizThree +
        " Midterm: " + midterm + " Final: " + finalExam);
        System.out.println("Overall Numeric Grade: " + totalWeightedScore + "%");
        System.out.println("Letter Grade: " + letterGrade);


    }
}

