package JavaJuly.Week_5;
import java.util.Scanner;
public class ConditionsStatement {
    public static void main(String[] args) {
       var scanner = new Scanner(System.in);
       String firstName;
       String lastName;

        System.out.println("Enter your firstName: " );
        firstName = scanner.next();
        System.out.println("Enter your lastName: ");
        lastName = scanner.next();

        if(firstName.equals(lastName)){
            System.out.println("Your first and last name are same");
        }else {
            System.out.println("Your first and last name are not same");
        }

    }
}
