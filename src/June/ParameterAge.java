package June;

public class ParameterAge {
    static void checkAge(int age){
        if(age < 18){
            System.out.println("Access denied.");
        }else {
            System.out.println("Access granted.");
        }
    }

    public static void main(String[] args) {
        checkAge(21);
        checkAge(17);
        checkAge(19);
        checkAge(30);
    }
}
