package June;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String items;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to have?: ");
        items = scanner.nextLine();

        System.out.print("How much does it cost? ");
        price = scanner.nextDouble();

        System.out.print("How many you want? ");
        quantity = scanner.nextInt();
        total = price * quantity;
        System.out.println("\nYou have bought " + quantity + " " +items +"/s");
        System.out.println("Your price is : " + total + currency);


        scanner.close();
    }
}
