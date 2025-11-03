package June;
import java.util.Scanner;
public class PracticeForFun {
    public static void main(String[] args) {
        int number;
        var scnObj = new Scanner(System.in);

        System.out.print("Enter the number to check if even or odd: ");
        number = scnObj.nextInt();

        if ( number % 2 == 0 ) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

    }
}
