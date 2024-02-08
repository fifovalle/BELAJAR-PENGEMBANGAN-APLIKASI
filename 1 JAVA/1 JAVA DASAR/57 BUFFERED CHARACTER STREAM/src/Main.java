import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        // MEMBACA FILE
        FileReader fileReader = new FileReader("input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        bufferedReader.mark(200);

        String data = bufferedReader.readLine();
        System.out.println(data);

        bufferedReader.reset();

        char[] dataChar = new char[25];
        bufferedReader.read(dataChar, 0, 25);
        System.out.println(Arrays.toString(dataChar));

        bufferedReader.reset();
        System.out.println(bufferedReader.readLine());
        System.out.println(bufferedReader.readLine());

        // MENULIS FILE
        FileWriter fileWriter = new FileWriter("output.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedReader.reset();
        String baris1 = bufferedReader.readLine();
        String baris2 = bufferedReader.readLine();

        bufferedWriter.write(baris1, 0, baris1.length());
        bufferedWriter.flush();

        bufferedWriter.newLine();

        bufferedWriter.write(baris2, 0, baris2.length());
        bufferedWriter.flush();

        bufferedWriter.close();
        bufferedReader.close();
    }
}