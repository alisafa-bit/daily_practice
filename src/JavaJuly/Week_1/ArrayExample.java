package JavaJuly.Week_1;

public class ArrayExample {
    public static void main(String[] args) {
        String firstName = "Arash";
        String[] listOfNames = {"John", "Eric", "Erin", "Spartans"};

        System.out.println(firstName);
        System.out.println(listOfNames[0]);
        System.out.println(listOfNames[1]);
        System.out.println(listOfNames[2]);
        System.out.println(listOfNames[3]);

        for(int i = 0; i<listOfNames.length;i++){
            System.out.println(listOfNames[i]);
        }
    }
}
