package June;
import java.util.Scanner;

public class MadLipsGames {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String adjective1;
        String adjective2;
        String adjective3;
        String noun1;
        String verb1;

        System.out.println("enter an a adjective");
        adjective1 = scanner.nextLine();
        System.out.println("enter a noun you have seen");
        adjective2 = scanner.nextLine();
        System.out.println("enter an a adjective2");
        adjective3 = scanner.nextLine();
        System.out.println("enter a verb in the past tense");
        noun1 = scanner.nextLine();
        System.out.println("enter an a adjective3");
        verb1 = scanner.nextLine();

        System.out.println("\n Yesterday I went to Amazon" + adjective1);
        System.out.println("I saw something " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1);
        System.out.println("I was " + adjective3 +" ?");


    }
}
