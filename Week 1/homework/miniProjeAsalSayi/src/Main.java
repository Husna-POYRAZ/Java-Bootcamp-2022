public class Main {
    public static void main(String[] args) {
        int number = 13;
        boolean isPrime = true;

        if (number < 2) {
            System.out.println("Geçersiz sayı!");
            return;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println(number + " sayısı asadır.");
        } else {
            System.out.println(number + " sayısı asal değildir.");
        }
    }
}