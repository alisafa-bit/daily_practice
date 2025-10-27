package October;

public class Counting_Word3 {
    public static void main(String[] args) {
        String text = "I think it is better to go";
        String[] spaces = text.trim().split("\\s+");
        int countWords = spaces.length;
        System.out.println("Total number of spaces is: " + countWords);

    }
}
