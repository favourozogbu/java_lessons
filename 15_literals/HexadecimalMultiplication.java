public class HexadecimalMultiplication {
    public static void main(String[] args) {
        // Using hexadecimal literals for multiplication
        int num1 = 0x1AB; 
        int num2 = 0xF;  
        int result = num1 * num2;

        // Print the result in decimals
        System.out.println("The product of 0x1AB and 0xF (in decimals) is: " + result);

        // Print the result in Hexadecimals
        System.out.println("The product of 0x1AB and 0xF (in Hexadecimals) is: " + Integer.toHexString(result).toUpperCase());
    }
}
