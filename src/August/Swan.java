package August;

public class Swan {
    public int sumDouble (int a, int b){
        int sum = a + b;
        return (a == b) ? 2 * sum : sum;
    }
    public static void main(String[] args) {
        Swan test = new Swan();
        System.out.println(test.sumDouble(222,222));
        System.out.println(test.sumDouble(2,2));
        System.out.println(test.sumDouble(3,3));
        System.out.println(test.sumDouble(44,4));
        System.out.println(test.sumDouble(14,14));
        System.out.println(test.sumDouble(44,44));
        System.out.println(test.sumDouble(24,24));
        System.out.println(test.sumDouble(4,4));

    }
}