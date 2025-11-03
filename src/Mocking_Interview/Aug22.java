package Mocking_Interview;

public class Aug22 {
    public static void main(String[] args) {
        //logical operator
        int age = 15;
        int income = 30000;
        if (age > 18 && income > 30000) {
            System.out.println("Your are eligible for loan");
        } else {
            System.out.println("your are not aligible for loan");
        }


        int boyAge = 18;
        boolean ParentalConsent = true;
        if (boyAge >= 18 || ParentalConsent) {
            System.out.println("Allow to practice");
        } else System.out.println("not allow to practice");

        boolean isRaining = true;
        if (!isRaining) {
            System.out.println("Lets go for a walk");
        } else System.out.println("Do not go for a walk");
    }
}
