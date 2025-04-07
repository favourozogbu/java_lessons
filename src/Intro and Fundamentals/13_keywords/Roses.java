import java.util.Scanner;
public class Roses {
    
    // Method to print the personalized version of "Roses Are Red"
    public static void printRoses() {
        System.out.println("Title: 'Roses are Red'");
        System.out.println("Author: Unknown (Inspired by the classic 'Roses are Red' poem)");
        System.out.println("\nRoses are red,");
        System.out.println("Violets are blue,");
        System.out.println("Sugar is sweet,");
        System.out.println("And so are you.");
        
    }

    // Method to print the dedication to Mr. WH by Shakespeare
    public static void printMrWH() {
        System.out.println("Dedication to Mr. WH");
        System.out.println("Author: William Shakespeare\n");
        System.out.println("Sonnet 20:");
        System.out.println("\nA woman's face with nature's own hand painted,");
        System.out.println("Hast thou the golden flashes in her hair;");
        System.out.println("A woman’s gentle heart, but not a woman’s mind,");
        System.out.println("Whose thoughts are wild and free, like wind, they fly");
        System.out.println("Yet on thee shall time’s wild storm be stayed.");
        System.out.println("Love lies in the heart, while the mind may stray,\n");
        System.out.println("- Shakespeare, Sonnet 20");
    }

    // Method to print "Grandchild's Guide to Using Grandpa's Computer"
    public static void printGrandchildGuide() {
        System.out.println("Grandchild's Guide to Using Grandpa's Computer");
        System.out.println("Author: Kenneth M. Kinds");
        System.out.println("\nPoem:");
        System.out.println("\nDear Grandpa, your computer is hard to use,");
        System.out.println("The mouse is always lost, and the keys confuse.");
        System.out.println("I click on this, and I click on that,");
        System.out.println("But it still doesn’t work, and now I feel flat.");
        System.out.println("Please help me, Grandpa, with your trusty guide,");
        System.out.println("The ‘power button’ says ‘Hello’, but you hide.");
        System.out.println("But together, dear Grandpa, we will make it work,");
        System.out.println("And maybe even have some fun – no quirk!");
        System.out.println("\n- Kenneth M. Kinds");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu: Which poem do you want to print");
        System.out.println("\n1: Roses are Red");
        System.out.println("\n2: Dedication to Mr. WH");
        System.out.println("\n3: Grandchild's Guide to Using Grandpa's Computer");
        System.out.println();

        int input = scanner.nextInt();

        switch (input) {
            case 1 -> printRoses();

            case 2 -> printMrWH();

            case 3 -> printGrandchildGuide();

            default -> System.err.println("Invalid input");
        }
        scanner.close();

    }
}
