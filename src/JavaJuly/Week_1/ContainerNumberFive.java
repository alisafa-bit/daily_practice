package JavaJuly.Week_1;

public class ContainerNumberFive {
    public static void main(String[] args) {
        int numberFive = 5;// Variable that hold int value and the int value is 5
        String name = "Arash";

        System.out.println(name);
        System.out.println(numberFive + 7);
        System.out.println(numberFive + 4);
        System.out.println(numberFive + 12);

        System.out.println(addTwoNumber(10,20));
        //Greater than
        if( 5 > 10){
            System.out.println( "5 is less than 10");
        }else
            System.out.println("10 is greater then 5");

        //Loop the name
        for(int i = 0; i <=10; i++){
            System.out.print("Arash " + i );
        }
        System.out.println();
        //Loop with coma
        for(int i=0; i <= 4; i++){
            System.out.print(i + ", ");
        }
    }
    public static int addTwoNumber(int numberOne, int numberTwo){
        return numberOne + numberOne;
    }
}
