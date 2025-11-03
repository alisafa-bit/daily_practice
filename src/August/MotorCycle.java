package August;

public class MotorCycle extends Bike{
    @Override
    public void run(){
        System.out.println("running safely with 60km.");
    }
    public static void main(String[] args) {
        var obj = new MotorCycle();
        obj.run();
    }
    
}
