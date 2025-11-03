package Fredericks.april_23;

public class Midnight_hustle {
    public static void main(String[] args) {
        String fName = "Alexander Morphy";
        fName=fName.replace("Alexander", "Erin");
        System.out.println(fName);

        fName=fName.replace("Morphy","Curreto");
        System.out.println(fName);

        fName = fName.replaceAll("Erin Curreto","John Doe");
        System.out.println(fName);

        fName=fName.replaceAll(" ","");
        System.out.println(fName);

        System.out.println(fName.length());

    }
}
