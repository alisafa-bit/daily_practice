package Mocking_Interview;

public class BMW implements Vehicle{
    @Override
    public void start() {
        System.out.println("let's start the car");
    }

    @Override
    public void off() {
        System.out.println("shut it off");
    }

    public static void main(String[] args) {
     BMW bmw = new BMW();
        bmw.start();
        bmw.off();

    }
}
