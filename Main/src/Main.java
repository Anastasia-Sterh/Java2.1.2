public class Main {
    public static void main (String[] args) {
        long balance = 100;
        long refill = 100;
        balance = balance + refill;
        if (refill > 1000) {
            long bonus = refill / 100;
            balance = balance + bonus;
        }
        System.out.println(balance);
    }
}