import java.util.Scanner;

public class BooleanConversion{
    public static void main(String [] args){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a Boolean: ");        
            String input = scanner.nextLine();


            boolean convertedInput = Boolean.parseBoolean(input);
            System.out.println(convertedInput);
        }
    }
}

