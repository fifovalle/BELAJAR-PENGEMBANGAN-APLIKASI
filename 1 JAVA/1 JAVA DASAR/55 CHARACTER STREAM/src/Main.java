import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // MEMBUKA FILE
        FileInputStream byteFileInput = new FileInputStream("input.txt");
        FileReader charFileInput = new FileReader("input.txt");

        FileOutputStream byteFileOutput = new FileOutputStream("outputByte.txt");
        FileWriter charFileOutput = new FileWriter("outputChar.txt");
        // MEMBACA FILE
        int buffer = byteFileInput.read();
        while (buffer != -1) {
            System.out.print((char) buffer);
            byteFileOutput.write(buffer);
            buffer = byteFileInput.read();
        }

        System.out.println("\n");

        buffer = charFileInput.read();
        while (buffer != -1) {
            System.out.print((char) buffer);
            charFileOutput.write(buffer);
            buffer = charFileInput.read();
        }

        // MENUTUP FILE
        byteFileInput.close();
        byteFileOutput.close();
        charFileInput.close();
        charFileOutput.close();
    }
}