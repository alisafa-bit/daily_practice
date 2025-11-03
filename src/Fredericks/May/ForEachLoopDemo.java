package Fredericks.May;

import java.util.Locale;

public class ForEachLoopDemo {
    public static void main(String[] args) {
        String[] names = {"Ali", "Kazim", "khan"};
        for(int i=0;i<names.length; i++){
            names[i] = names[i].toUpperCase();
            System.out.println(names[i]);
        }
    }
}
