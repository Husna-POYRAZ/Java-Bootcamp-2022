import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> sehirler = new ArrayList<>();
        sehirler.add("Ankara");
        sehirler.add("İstanbul");
        sehirler.add("İzmir");
        sehirler.add("Konya");
        sehirler.add("Antalya");
        System.out.println("Toplam şehir sayısı =  " +sehirler.size());

        sehirler.remove(3);

        for (String sehir : sehirler) {
            System.out.println(sehir);
        }

        System.out.println("*******");

        Collections.sort(sehirler);
        for (String sehir : sehirler) {
            System.out.println(sehir);
        }

    }
}