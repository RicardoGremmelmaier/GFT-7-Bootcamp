public class TimeMain {
    public static void main(String[] args) {
        Clock americanClock = new AmericanClock(14, 30, 45);
        Clock brazilianClock = new BrazilianClock(14, 30, 45);

        System.out.println("===============================");
        System.out.println(americanClock.getTime());
        americanClock.convertFormat(americanClock);
        System.out.println(americanClock.getTime());
        System.out.println("===============================");

        System.out.println("===============================");
        System.out.println(brazilianClock.getTime());
        brazilianClock.convertFormat(brazilianClock);
        System.out.println(brazilianClock.getTime());
        System.out.println("===============================");
    }
}
