package JavaJuly.Week_3;

public class OperatorNoneEquality {
    public static void main(String[] args) {
        int intValue = 10;
        int intValueTwo = 3;

        System.out.println(intValue / intValueTwo); // 3
        System.out.println(intValue % intValueTwo); // 1

        for(int number =0; number <= 17; number++){
            if(number % 2 == 0){
                System.out.print(number + ", ");
            }
        }

    }
}
