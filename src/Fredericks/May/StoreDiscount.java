package Fredericks.May;
import java.util.Scanner;
public class StoreDiscount {
    public static void main(String[] args) {

        // Declare the Variables
        boolean isMember;
        double originalPrice;
        double finalPrice;
        int userChoice;

        //object of scanner
        var sc = new Scanner(System.in);

        System.out.println("Please enter original price?");
        originalPrice=sc.nextInt();

        System.out.println("*************MENU*****************");
        System.out.print("Please choose your membership status: ");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.println("3. Exit");
        System.out.print("Your Selection:");
        userChoice=sc.nextInt();
    }
}
