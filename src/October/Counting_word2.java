package October;

public class Counting_word2 {
    public static void main(String[] args) {
        String text = "Tomorrow is picture day";
        int number = text.split(" ").length;

        String [] spaces = text.split(" ");

        System.out.println(spaces.length);
        System.out.println(number);
    }
}
