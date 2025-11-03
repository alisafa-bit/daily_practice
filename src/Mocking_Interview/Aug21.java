package Mocking_Interview;

public class Aug21 {
    public static void main(String[] args) {
        String firstName = "Ali";
        String[] listOfFirstName = {"Ali", "Eric", "Erin", "Spartans"};

        for (int index = 0; index<listOfFirstName.length; index++){
            System.out.print(listOfFirstName[index] +", ");
        }

        boolean JavaisFun = false;
        if (JavaisFun){
            System.out.println("Yes it is.");
        } else {
            System.out.println("not it not fun.");
        }

    }
}
