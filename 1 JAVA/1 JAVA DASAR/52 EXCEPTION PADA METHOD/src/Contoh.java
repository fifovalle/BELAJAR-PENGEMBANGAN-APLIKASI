import java.io.FileInputStream;
import java.io.IOException;

public class Contoh {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("test.txt");

        System.out.println((char) file.read());
    }
}
