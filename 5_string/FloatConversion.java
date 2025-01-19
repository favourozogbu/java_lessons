import java.util.Scanner;

public class FloatConversion{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Float: ");        
        String input = scanner.nextLine();


        float convertedInput = Float.parseFloat(input);
        System.out.println(convertedInput);
    }
}
