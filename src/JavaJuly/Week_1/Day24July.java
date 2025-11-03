package JavaJuly.Week_1;
import java.util.Scanner;
public class Day24July {

    public static void main(String[] args) {
        int id;
        String firstName;
        String lastName;
        String jobTitle;
        String dateOfBirth;

        Scanner userInput = new Scanner(System.in);
        id = userInput.nextInt();

        System.out.print("Please enter your firstName: ");
        firstName = userInput.next();

        System.out.print("Please enter your lastName: ");
        lastName = userInput.next();

        System.out.print("Please enter your job title: ");
        jobTitle = userInput.next();

        System.out.print("Please enter your date of birth: ");
        dateOfBirth = userInput.next();

        System.out.println( "Your id is: " + id );
        System.out.println( "Your firstName is: " + firstName );
        System.out.println( "Your lastName is: " + lastName );
        System.out.println( "Your job title is: " + jobTitle );
        System.out.println( "Your date of birth is: " + dateOfBirth );
    }
}