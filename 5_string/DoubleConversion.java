import java.util.Scanner;

public class DoubleConversion{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Double: ");        
        String input = scanner.nextLine();

        double convertedInput = Double.parseDouble(input);
        System.out.println(convertedInput);
    }
}
