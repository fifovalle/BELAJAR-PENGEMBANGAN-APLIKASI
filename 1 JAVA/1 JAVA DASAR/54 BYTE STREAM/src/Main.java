import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        fileInputStream = new FileInputStream("input.txt");

        int data = fileInputStream.read();
        while (data != -1) {
            System.out.println((char) data);
            data = fileInputStream.read();
        }

        fileInputStream.close();

        try {
            fileInputStream = new FileInputStream("input2.txt");
            fileOutputStream = new FileOutputStream("output2.txt");

            int buffer = fileInputStream.read();

            while (buffer != -1) {
                fileOutputStream.write(buffer);
                buffer = fileInputStream.read();
            }
        } finally {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
        }

        try (FileInputStream in = new FileInputStream("input.txt");
                FileOutputStream out = new FileOutputStream("output.txt")) {
            int baca = in.read();
            while (baca != -1) {
                out.write((char) baca);
                baca = in.read();
            }
        }
    }
}