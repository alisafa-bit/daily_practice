package Fredericks.april_23;

public class Midnight_hustle1 {
    public static void main(String[] args) {
        String looks = "old faces";
        String boring = "new faces";
        String promo = " java is easy, java fun, java class";
        looks = looks.replace("old","New");

        System.out.println(looks);
        boring=boring.replace("new faces", "Passage of time");
        System.out.println(boring);
        promo=promo.replace("j","S");
        System.out.println(promo);
        System.out.println(looks.concat(looks));




    }
}
