package Mocking_Interview;

public class Auq27_Method {

    public static void sayHello(){
        System.out.println("Hello world");
    }
    public static String showInformation( String name, String age){
        return name + " is " + age + " years old.";

    }

    public static void main(String[] args) {
        // we have 4 access modifier: protected, private, default.

     sayHello();
     String outCome = showInformation("ali","34");
        System.out.println(outCome);
    }
}
