import java.util.Scanner;

public class Keywords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("type 1 to start loop and 0 to exit");
        int input = scanner.nextInt();

        switch (input) {
            case 0:
                System.out.println("congrats you made the right choice");
                scanner.close();
                break;
            case 1:
                int limit = 5;
                while(limit != 0){
                    System.out.println("its a while loop");
                    limit--;
                }
            default:
        }
        
        scanner.close();



    }
}
