import java.util.Scanner;
public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name: ");
        var name = scanner.nextLine();

        System.out.println("What is your surname: ");
        var surname = scanner.nextLine();

        System.out.println("What is your age: ");
        var age = scanner.nextLine();

        scanner.close();
        System.out.println("Hello "+name+" "+surname +"\nYou are " + age +" years old");

    }
}
