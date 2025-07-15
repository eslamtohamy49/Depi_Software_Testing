/*
 * Program Title : Count Digits in a Number
 * Author        : Eslam Tohamy
 * Date          : July 15, 2025
 * Description   : This program takes an integer input from the user and counts
 *                 how many digits it contains using a while loop.
 *
 * Key Concepts  :
 *  - Use of while loop
 *  - Integer division
 *  - Handling special case: number = 0
 */


import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int digitsNumber=0;
        int numberCountingItsDigits;
        Scanner inputObject = new Scanner(System.in);
        System.out.println("Enter a number please ");
        numberCountingItsDigits = inputObject.nextInt();
       while(numberCountingItsDigits>0)
       {
           digitsNumber++;
           numberCountingItsDigits/=10;
       }
        System.out.println("Digits = "+ digitsNumber);
    }

}