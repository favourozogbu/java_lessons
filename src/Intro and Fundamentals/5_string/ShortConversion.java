import java.util.Scanner;


public class ShortConversion{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Short: ");        
        String input = scanner.nextLine();

        short convertedInput = Short.parseShort(input);
        System.out.println(convertedInput);
    }
}


