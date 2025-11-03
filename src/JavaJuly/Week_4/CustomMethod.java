package JavaJuly.Week_4;

public class CustomMethod {
    public static void main(String[] args) {
        String message = "                Welcome to Java                ";
        System.out.println(message);
        String charAtIndexZero = message.charAt(0) + "";
        System.out.println( message.replace(message.charAt(0), '-') );
        System.out.println( (message.replaceAll(charAtIndexZero, "-")) );
        System.out.println( (message.replaceAll(charAtIndexZero, " ")) );
    }
}
