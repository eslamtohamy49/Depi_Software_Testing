/*
 * -----------------------------------------------------------------------------------------
 *  Project       : Student Grade Calculator
 *  File Name     : Main.java
 *  Author        : Eslam Tohamy
 *  Created Date  : July 15, 2025
 *  Description   :
 *      This Java program calculates the average of three exam scores for each student,
 *      determines the student's letter grade (A, B, C, F), and prints the result.
 *
 *      The program follows these steps:
 *          - Ask the user to input the number of students.
 *          - For each student:
 *              - Input the student’s name.
 *              - Input three exam scores.
 *              - Calculate the average score.
 *              - Assign a grade based on the average:
 *                  - A: 85 to 100
 *                  - B: 70 to 84
 *                  - C: 50 to 69
 *                  - F: Below 50
 *          - Print a summary with the student’s name, grade, and average percentage.
 *
 *      It uses:
 *          - Nested loops
 *          - Scanner class for input
 *          - Conditional statements for grade logic
 *
 *  Usage:
 *      Compile: javac Main.java
 *      Run    : java Main
 *
 *  Example Output:
 *      Enter the number of students ,please
 *      2
 *      Enter student name number 1 :
 *      Ahmed
 *      Enter three exam scores :
 *      Enter number 1 : 90
 *      Enter number 2 : 80
 *      Enter number 3 : 70
 *      Student : Ahmed get A Grade : B with a precent : 80.0 %
 *
 * -----------------------------------------------------------------------------------------
 */



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int studentsNumber;
        String studentName;
        char studentGrade = 'N';
        double eachExamScore, scoresSummation, averageScores;
        Scanner inputObject = new Scanner(System.in);
        System.out.println("Enter the number of students ,please");
        studentsNumber = inputObject.nextInt();

        for (int counter = 0; counter < studentsNumber; counter++) {
            studentName = inputObject.nextLine();

            System.out.println("Enter student name number " + (counter + 1) + " :");
            studentName = inputObject.nextLine();

            System.out.println("Enter three exam scores : ");
            scoresSummation = 0;
            for (int index = 0; index < 3; index++) {
                System.out.print("Enter number " + (index + 1) + " : ");
                eachExamScore = inputObject.nextDouble();
                scoresSummation += eachExamScore;
            }

            averageScores = scoresSummation / 3;
            if (averageScores >= 0f && averageScores <= 100f) {
                if (averageScores >= 85) {
                    studentGrade = 'A';
                } else if (averageScores >= 70 && averageScores <= 84) {
                    studentGrade = 'B';
                } else if (averageScores >= 50 && averageScores <= 69) {
                    studentGrade = 'C';
                } else {
                    studentGrade = 'F';
                }
            } else {
                System.out.println("Invalid exam scores try again ,please");
            }

            System.out.println("Student : " + studentName + " get A Grade : " + studentGrade + " with a precent : " + averageScores + " %");


        }

    }
}