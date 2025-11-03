package Nov_25;

public class CloneAsimipleClass {
    public void model(String arg1){
        arg1 = "Am I going to disappear";
    }

    public static void main(String[] args) {
        CloneAsimipleClass clone = new CloneAsimipleClass();
        String past = "I am born new";
        clone.model(past);
        System.out.println(past);

    }
}
