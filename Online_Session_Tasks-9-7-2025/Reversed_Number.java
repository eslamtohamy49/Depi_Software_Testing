/*
 * Program Title : Reverse a Number
 * Author        : Eslam Tohamy
 * Date          : July 15, 2025
 * Description   : This program takes an integer input from the user and
 *                 prints its reverse using a while loop.
 *
 * Key Concepts  :
 *  - Use of while loop
 *  - Modulo and division operations
 *  - Handling negative numbers
 */

import java.util.Scanner;
import java.lang.Math.*;

import static java.lang.Math.abs;

public class Main
{
    public static void main(String[] args)
    {
        int numberToReverse;
        int temporaryCopy;
        int singleDigit;
        int reversedNumber=0;
        Scanner inputObject = new Scanner(System.in);
        System.out.println("Enter a number,please");
        numberToReverse = inputObject.nextInt();
        temporaryCopy = numberToReverse;
        if(numberToReverse <0)
        {
            temporaryCopy = abs(temporaryCopy);
        }
        while(temporaryCopy > 0)
        {
            singleDigit = temporaryCopy % 10;
            reversedNumber = reversedNumber * 10 + singleDigit;
            temporaryCopy /=10;
        }
        if(numberToReverse<0)
        {
            reversedNumber *=-1;
        }
        System.out.println("Reversed number is : "+ reversedNumber);

    }

}