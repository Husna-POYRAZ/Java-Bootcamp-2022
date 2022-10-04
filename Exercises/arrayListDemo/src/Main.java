import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList sayilar = new ArrayList();

        System.out.println(sayilar.size());

        sayilar.add(1);
        sayilar.add(10);
        sayilar.add("İstanbul");
        System.out.println(sayilar.size());

        System.out.println(sayilar.get(2));

        sayilar.set(2, "Ankara");
        System.out.println(sayilar.get(2));

        sayilar.remove(0);
        System.out.println(sayilar.get(0));

        System.out.println("-------");

        for (Object i : sayilar) {
            System.out.println(i);
        }

        System.out.println("-------");

        sayilar.clear();
        System.out.println(sayilar.size());
    }
}