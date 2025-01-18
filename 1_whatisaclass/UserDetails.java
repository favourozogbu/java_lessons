import java.util.Scanner;

public class UserDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Part 1: Collect User Details
        System.out.print("What is your name: ");
        String name = scanner.nextLine();

        System.out.print("What is your surname: ");
        String surname = scanner.nextLine();

        System.out.print("Enter your date of birth (DD/MM/YYYY): ");
        String dateOfBirth = scanner.nextLine();

        System.out.print("How far is your favourite store from your home (in kilometers): ");
        double distanceFromStore = scanner.nextDouble();

        // Part 2: Greeting and Age Calculation
        System.out.println("Hello " + name + " " + surname);

        String[] dobParts = dateOfBirth.split("/");
        int birthYear = Integer.parseInt(dobParts[2]);
        int currentYear = java.time.Year.now().getValue();
        int age = currentYear - birthYear;

        System.out.println("You are " + age + " years old.");

        // Part 3: Distance Conversion and Age Calculations
        double distanceInMiles = distanceFromStore * 0.621371; // Conversion to miles
        double distanceInMeters = distanceFromStore * 1000; // Conversion to meters

        long ageInSeconds = (long) age * 365 * 24 * 60 * 60; // Approximate age in seconds
        long ageInMilliseconds = ageInSeconds * 1000; // Age in milliseconds

        // Display results
        System.out.printf("Distance to the store in miles: %.2f miles\n", distanceInMiles);
        System.out.printf("Distance to the store in meters: %.2f meters\n", distanceInMeters);
        System.out.println("Your age in seconds: " + ageInSeconds + " seconds");
        System.out.println("Your age in milliseconds: " + ageInMilliseconds + " milliseconds");

        // Show off: Age in Hex and Binary
        System.out.println("Your age in hexadecimal: " + Integer.toHexString(age));
        System.out.println("Your age in binary: " + Integer.toBinaryString(age));

        // Close the scanner
        scanner.close();
    }
}
