import java.util.Scanner;

public class LongConversion{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Long: ");        
        String input = scanner.nextLine();

        long convertedInput = Long.parseLong(input);
        System.out.println(convertedInput);
    }
}
