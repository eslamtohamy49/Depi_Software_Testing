/*
 * Multiplication Table Generator
 * Author        : Eslam Tohamy
 * Date          : July 15, 2025
 * Description   : Prints multiplication tables from 1 to 10, each from 1 to 12.
 */

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("This program is to print Multiplication Table to numbers form 1 to 10 ");

        for(int index=1;index<=10;index++)
        {
            System.out.println("--------------------------------------------------------------");
            System.out.println("Multiplay Table of number :" + index +" : ");
            for(int counter=1;counter<=12;counter++)
            {
                System.out.println(index+ " x "+counter +" = " + (index * counter));
            }
            System.out.println("---------------------------------------------------------------");
        }
    }

}