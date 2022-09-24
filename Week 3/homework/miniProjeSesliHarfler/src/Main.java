public class Main {
    public static void main(String[] args) {
        char harf1 = 'İ';
        char harf2 = Character.toUpperCase(harf1);

        switch (harf2) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın sesli harf");
                break;
            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
                System.out.println("İnce sesli harf");
                break;
            default:
                System.out.println("Sesli harf degildir.");
        }
    }
}