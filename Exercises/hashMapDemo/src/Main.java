import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> sozluk = new HashMap<>();
        sozluk.put("book", "kitap");
        sozluk.put("table", "masa");
        sozluk.put("computer", "bilgisayar");
        sozluk.put("pen", "kalem");

        for (String item : sozluk.keySet()) {
            System.out.println("Anahtar kelime: " + item);
            System.out.println("Değer: " + sozluk.get(item));
        }

        System.out.println(sozluk);
        System.out.println(sozluk.size());
        System.out.println(sozluk.get("table"));

        sozluk.remove("table");
        System.out.println(sozluk);

        sozluk.clear();
        System.out.println(sozluk.size());


    }
}