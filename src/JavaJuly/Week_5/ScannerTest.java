package JavaJuly.Week_5;
import java.util.Scanner;
public class ScannerTest {
    public static void main(String[] args) {
        Scanner scnObj = new Scanner(System.in);
      // int choice;
        String choice;
        boolean yesOrNo;

        /*
         * 1. Yes
         * 2. No
         * Enter: 1
         * */

        System.out.println("Please select one of the options below: ");
        System.out.println("1. Yes ");
        System.out.println("2. No ");
        System.out.print("Enter your choice: ");
        //choice = scnObj.nextInt();
        choice = scnObj.next();
        if ( choice.equals("Yes") ) {
            yesOrNo = false;
        } else {
            yesOrNo = false;
        }

        System.out.println( yesOrNo );

        System.out.println( yesOrNo );
    }
}
