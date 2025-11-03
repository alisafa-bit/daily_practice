package July;

public class PrintAZ {
    public static void main(String[] args) {
        // Given a String
        String str = "Hello and Welcome To TekSchool";
        System.out.println(str.replaceAll("[^A-Z]","").length());
    }
}
