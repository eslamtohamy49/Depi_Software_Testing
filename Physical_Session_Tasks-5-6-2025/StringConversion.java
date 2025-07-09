import java.util.Scanner;

public class StringAnalysis 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String upperCaseSentence = sentence.toUpperCase();

        int length = sentence.length();

        char firstChar = sentence.charAt(0);

        System.out.println("Uppercase: " + upperCaseSentence);
        System.out.println("Length: " + length);
        System.out.println("First character: " + firstChar);



        scanner.close();
    }
}
