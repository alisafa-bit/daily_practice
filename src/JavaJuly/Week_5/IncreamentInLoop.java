package JavaJuly.Week_5;

public class IncreamentInLoop {
    public static void main(String[] args) {
        String firstName="alimohammadsafa";
        for (int index = 4; index < firstName.length(); index++ ) {
            System.out.print( firstName.charAt(index) );
        }
        for ( int number = 1; number <= 10; number++) {
           System.out.print( ++number + ", " );
        }



    }
}
