package Fredericks.May;

public class ArraysOfLoops {
    public static void main(String[] args) {
        int[] mobileNumbers = new int[100];
        mobileNumbers[3] = 345234;
        mobileNumbers[6] = 345745;
        mobileNumbers[8] = 3423456;
        mobileNumbers[10] = 234562;
        mobileNumbers[88] = 23452;
        mobileNumbers[90] = 234122;//        for(int i = 0; i<mobileNumbers.length; i++) System.out.println("The elements of: "+ i + " is "+mobileNumbers[i]);
        String[] names = new String[4];
        names[0] = "ali";
        names[1] = "safa";
        names[2] = "waqas";
        names[3] = "Eric";
        for (int i = 0; i < names.length; i++) System.out.println("The elements of: " + i + " is " + names[i]);
    }
}
