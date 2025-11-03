package Fredericks.april_23;

public class Aheadto {
    public static void main(String[] args) {
        String name = "alvsdfq3w4temnlsdfgl;LSOIERTNCV2343536 12343255678J789.";
        System.out.println(name.replaceAll("[^a-z]", ""));
        System.out.println(name.replaceAll("[^A-Z]", ""));
        System.out.println(name.replaceAll("[A-Z]", ""));
        System.out.println(name.replaceAll("[^1-3]", ""));
        System.out.println(name.replaceAll("[0-9]", ""));
        System.out.println(name.replaceAll("[a-z]", ""));
        System.out.println(name.replaceAll("[^0-9]", ""));
    }
}
