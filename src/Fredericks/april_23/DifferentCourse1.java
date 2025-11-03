package Fredericks.april_23;

public class DifferentCourse1 {
    public static void main(String[] args) {
        int num1 = 49;
        int num2 = 44;
        int result = num1 + num2;
        //System.out.println(result);
        //System.out.println(num1 + num2);
        int result2 = result + 20;
        //System.out.println(result2);
        //System.out.println( "This is my number: " + (20 + 30));
        //System.out.println(39 + 23 + " This was the number above.");
        int multi = num1 * num2;
        //System.out.println(multi);
        int divi = num1 / num2;
        //System.out.println(divi);
        int mod = num1 % num2;
        //System.out.println(mod);

        String name =" ali mohammad";
        String numname = "";
        for(int i=name.length()-1; i>=0; i--){
           numname += name.charAt(i);
        }
        //System.out.println(numname);

        for(int i =0; i<name.length(); i++){
        numname += name.charAt(i);
        }
        System.out.println(numname);
    }
}
