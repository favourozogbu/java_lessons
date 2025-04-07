import java.util.Scanner;

public class SentenceConcatenation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize masterLine 
        String masterLine = "";

        // Loop to keep asking for sentences
        while (true) {
            System.out.print("Enter a sentence (or type 'exit' to quit): ");
            String input = scanner.nextLine();

            // Check if the user wants to exit the loop
            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            // Concatenate the input sentence to masterLine with a new line character
            masterLine += "\n" + input;
        }

        // Print the masterLine
        System.out.println("Final masterLine: " + masterLine);

        scanner.close();
    }
}
