package JavaJuly.Week_3;

public class CountOddNumber {
    public static void main(String[] args) {
        int countOdd = 0;
        int[] numbers = { 10, 2, 1, 0, 100, 954, 933, 4, 3, 3, 1, 5, 35, 13 };

        for(int eachelements: numbers){
            if(eachelements % 2 != 0 ){
                countOdd++;
                System.out.print(eachelements + ", ");
            }
        }
        System.out.println();
        System.out.println("I have found " + countOdd + " odds numbers");
    }
}
