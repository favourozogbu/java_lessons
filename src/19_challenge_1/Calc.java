import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter first number (or 'x' to exit): ");
            String input1 = scanner.next();

            if (input1.equalsIgnoreCase("x")) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }

            if (!isNumeric(input1)) {
                System.out.println("Invalid input. Please enter a valid number.");
                continue;
            }

            double operand1 = Double.parseDouble(input1);

            System.out.print("Enter an operator (+, -, *, /, %): ");
            String operator = scanner.next();

            if (!isValidOperator(operator)) {
                System.out.println("Invalid operator. Please enter a valid operator.");
                continue;
            }

            System.out.print("Enter second number: ");
            String input2 = scanner.next();

            if (!isNumeric(input2)) {
                System.out.println("Invalid input. Please enter a valid number.");
                continue;
            }

            if (input2.equalsIgnoreCase("x")) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }

            double operand2 = Double.parseDouble(input2);

            double result = performOperation(operand1, operand2, operator);
            System.out.println(operand1 + " " + operator + " " + operand2 + " = " + result);
        }

        scanner.close();
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isValidOperator(String operator) {
        return operator.equals("+") || operator.equals("-") || operator.equals("*") ||
               operator.equals("/") || operator.equals("%");
    }

    public static double performOperation(double operand1, double operand2, String operator) {
        return switch (operator) {
            case "+" -> operand1 + operand2;
            case "-" -> operand1 - operand2;
            case "*" -> operand1 * operand2;
            case "/" -> operand2 != 0 ? operand1 / operand2 : Double.NaN; // Handle division by zero
            case "%" -> operand2 != 0 ? operand1 % operand2 : Double.NaN; // Handle modulo by zero
            default -> 0; // This case should never be reached due to validation
        };
    }
}
