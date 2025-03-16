import java.util.Scanner;


public class CharConversion{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Char: ");        
        String input = scanner.nextLine();

        if(input.length() == 1){
            char convertedInput = input.charAt(0);
            int converteduniInput = convertedInput;
            System.out.println("as char: "+convertedInput);
            System.out.println("as unicode: "+converteduniInput);
        }
        else{
            System.out.println("not a char");
        }
        scanner.close();
    }
}


