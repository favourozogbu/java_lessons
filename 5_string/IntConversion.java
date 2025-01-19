import java.util.Scanner;

public class IntConversion{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an Integer: ");        
        String input = scanner.nextLine();

        int convertedInput = Integer.parseInt(input);
        System.out.println(convertedInput);
    }
}
