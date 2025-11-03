package Fredericks.april_23;

public class Transportation {
    public static String travel(int distance){
        return distance<1000? "train" : "car";
    }

    public static void main(String[] answer) {
        System.out.print(travel(1000));
    }
}
