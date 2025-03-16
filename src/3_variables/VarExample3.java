//import java.util.ArrayList;
public class VarExample3 {
    public static void main(String[] args) {
      
       var myVar = 10; // myVar is inferred as an integer (int)
       System.out.println("Initial value: " + myVar);

       // Reassigning a different type (string) to the same variable
       myVar = 20;//"Hello, World!"; // myVar is now inferred as a String
       System.out.println("New value: " + myVar);
    }
}
