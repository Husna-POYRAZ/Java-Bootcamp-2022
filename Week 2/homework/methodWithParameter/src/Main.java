public class Main {
    public static void main(String[] args) {
        String mesaj = sehirVer();
        String yeniMesaj = mesaj + " bugün hava çok güzel.";
        System.out.println(yeniMesaj);

        int sayi = topla(7, 3);
        System.out.println(sayi);
    }
    public static void ekle() {
        System.out.println("Eklendi");
    }

    public static void sil() {
        System.out.println("Silindi");
    }

    public static void guncelle() {
        System.out.println("Güncellendi.");
    }

    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public static String sehirVer() {
        return "Ankara'da";
    }
}