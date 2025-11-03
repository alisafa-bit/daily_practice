package July;

public class ReviewTwo extends Review{
    @Override
    public int add(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }
    @Override
    public double add(double numberOne, double numberTwo){
        return numberOne - numberTwo;
    }
    @Override
    public double add(double numberOne, double numberTwo, double numberThree) {
        return numberOne * numberTwo * numberThree;
    }
}
