package August;

public class Combinatiion_1to3 {
    public static void main(String[] args) {
        printNumbers(10, 50);
    }

    public static void printNumbers(int start, int end) {

        int totallCombinationNum = 0;

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                for (int n = start; n <= end; n++) {
                    System.out.println(i + ", " + j + ", " + n);
                    totallCombinationNum++;
                }
            }
        }
        System.out.println(totallCombinationNum);
    }
}
