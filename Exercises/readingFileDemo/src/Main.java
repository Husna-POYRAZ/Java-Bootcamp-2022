import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("C:\\java2022-homework\\exercises\\readingFileDemo\\src\\sayilar.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            reader.close();
        }
    }
}