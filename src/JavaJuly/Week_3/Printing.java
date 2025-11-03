package JavaJuly.Week_3;

public class Printing {
    String firstName = "John";
    static String lastName = "Alexander";


    public static void main(String[] args) {
        var obj = new Printing();
        System.out.println(obj.firstName);
        System.out.println(lastName);

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + ": Hameed");
        }
        System.out.println( 'A' + 0 );
        System.out.println( 'a' + 0 );
        System.out.println( '@' + 0 );

        int a = 5;
        int b = a;
        b = 3;
        System.out.println(a);

        String greeting = "Hello";
        System.out.println(greeting.replace('H', 'J'));

        int num = 5;
        String result = "Sum: " + 5 + 5;
        System.out.println(result + " is ten");// its 55

        String message = "Result " + (2 + 2);
        System.out.println(message.equals("Result 4"));

        int apple = 10; double orange = 5, total;
        total = apple + orange;
        System.out.println("Total fruite: " + total);
    }
}
