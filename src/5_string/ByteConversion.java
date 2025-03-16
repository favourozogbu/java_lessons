import java.util.Scanner;


public class ByteConversion{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Byte: ");        
        String input = scanner.nextLine();

        byte convertedInput = Byte.parseByte(input);
        System.out.println(convertedInput);
    }
}


