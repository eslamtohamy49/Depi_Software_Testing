/*
 * Program Name: Student Marks Analysis
 * Author: Eslam Tohamy
 * Date: July 15, 2025
 *
 * Description:
 * This Java program allows the user to input marks for a given number of students.
 * It then processes the following:
 *  - Calculates and prints the average mark.
 *  - Finds and displays the highest and lowest marks.
 *  - Counts and displays how many students passed (mark >= 50) and failed.
 *  - Prints each student's mark.
 *
 * Features:
 *  - Uses arrays to store student marks.
 *  - Uses loops to handle input and processing.
 *  - Simple statistical calculations (average, max, min).
 *
 * How to Use:
 * 1. Run the program.
 * 2. Enter the number of students when prompted.
 * 3. Enter each student’s mark when asked.
 * 4. View the summary of all results.
 */


import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int studentsNumber,studentMarkSummation=0,passedStudents=0,studentMarkAverage,highestMark=0,lowestMark=100;

        Scanner inputObject = new Scanner(System.in);

        System.out.println("Enter ,how many student ?! ");
        studentsNumber = inputObject.nextInt();

        int []studentsMarks= new int[studentsNumber];

        for(int counter=0;counter<studentsNumber;counter++)
        {

            System.out.print("Enter The Student Number "+(counter+1)+" Mark : ");
            studentsMarks[counter] = inputObject.nextInt();
            studentMarkSummation += studentsMarks[counter];

        }

        studentMarkAverage = studentMarkSummation /studentsNumber;

        for(int index=0;index<studentsNumber;index++)
        {

            if(studentsMarks[index] > highestMark)
            {
                highestMark = studentsMarks[index];
            }
            if(studentsMarks[index] < lowestMark)
            {
                lowestMark = studentsMarks[index];
            }
            if(studentsMarks[index] >=50)
            {
                passedStudents++;
            }

            System.out.println("Student Number :  " + (index+1) + " Mark is : " + studentsMarks[index]);
        }


        System.out.println("Average of Student Marks is : "+ studentMarkAverage);
        System.out.println("The Highest mark is : "+highestMark+" And the lowest mark is : "+lowestMark);
        System.out.println("Passed Student Numbers is: "+passedStudents+" And Failed Students is: "+(studentsNumber - passedStudents));

    }

}