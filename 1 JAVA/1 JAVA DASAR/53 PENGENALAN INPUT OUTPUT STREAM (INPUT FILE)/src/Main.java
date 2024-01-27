import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fileMasukan = new FileInputStream("input.txt");

        System.out.println((char) fileMasukan.read());
        System.out.println((char) fileMasukan.read());
        System.out.println((char) fileMasukan.read());
        System.out.println((char) fileMasukan.read());
    }
}