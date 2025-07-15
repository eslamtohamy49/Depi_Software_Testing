import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int numberCheckEvenOdd;
        for(int counter =1;counter<=10;counter++)
        {
            System.out.println(counter);
        }

        Scanner inputObject = new Scanner(System.in);
        System.out.println("Enter a number to check if even or odd");
        numberCheckEvenOdd = inputObject.nextInt();
        if(numberCheckEvenOdd %2 ==0)
        {
            System.out.println("Even number");
        }
        else
        {
            System.out.println("Odd number");
        }

    }
}