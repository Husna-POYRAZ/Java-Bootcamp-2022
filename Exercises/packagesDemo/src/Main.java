import matematik.DortIslem;
import matematik.Logaritma;
// import matematik.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adınız: ");
        String isim = scanner.nextLine();
        System.out.println("Merhaba " + isim);

        DortIslem dortIslem = new DortIslem();
        int toplam = dortIslem.topla(2, 4);
        System.out.println("Toplam = " + toplam);

        Logaritma logaritma = new Logaritma();


    }
}