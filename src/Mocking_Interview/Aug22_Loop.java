package Mocking_Interview;

public class Aug22_Loop {
    public static void main(String[] args) {
        //While loop
        int count = 1;
        while (count <= 10 ){
            System.out.print(count +", ");
            count++;
        }
        System.out.println();

        //do while loop
        int count1 =2;
        do {
            System.out.print(count1 + ", ");
            count1++;
        }while (count1<=20);
        System.out.println();


        //for loop
        for (int i = 5; i<= 10; i++ ){
            System.out.print(i + ", ");
        }
        System.out.println();

        // for each loop use for collection mostly
        int [] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int num : number){
            System.out.print(num + ", ");
        }


        int countOdd = 10000;
        int[] numbers = { 10, 2, 1, 0, 100, 954, 933, 4, 3, 3, 1, 5 };
        for (int eachNumber : numbers){
            if (eachNumber % 2 != 0){
                countOdd++;
                System.out.print(eachNumber +", ");
            }
        }
        System.out.println();
        for (int i=1; i<= 15;i++){
            if (i % 2 == 0)
                System.out.print(i + ", ");
        }

    }
}
