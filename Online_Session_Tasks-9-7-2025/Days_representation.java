import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int dayNumber;
        Scanner inputObject = new Scanner(System.in);
        System.out.println("\nweek days representation  saturday : 1 -> Friday : 7");
        System.out.println("Enter number express the day week number to print it : ");
        dayNumber = inputObject.nextInt();
        switch (dayNumber)
        {
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            case 3:
                System.out.println("Monday");
                break;
            case 4:
                System.out.println("Tuesday");
                break;
            case 5:
                System.out.println("Wednesday");
                break;
            case 6:
                System.out.println("Thursday");
                break;
            case 7:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Invalid number. Please enter a number from 1 to 7.");
        }

        inputObject.close();

    }

}
