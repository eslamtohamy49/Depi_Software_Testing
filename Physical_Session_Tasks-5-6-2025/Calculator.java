import java.util.Scanner;


public class Calculator 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        double quotient;
        if (num2 != 0) 
        {
            quotient = num1 / num2;
        } 
        else 
        {
            System.out.println("Error: Division by zero is not allowed.");
            scanner.close();
            return;
        }

        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
        System.out.println("Product = " + product);
        System.out.println("Quotient = " + quotient);


        scanner.close();
    }
}
