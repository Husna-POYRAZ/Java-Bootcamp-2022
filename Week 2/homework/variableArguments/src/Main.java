public class Main {
    public static void main(String[] args) {
        int toplam = topla(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Toplam = " + toplam);
    }

    public static int topla(int... sayilar) {
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        return toplam;
    }
}