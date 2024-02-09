import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        Scanner scanner = new Scanner(bufferedReader);
        System.out.println(scanner.next());
        System.out.println(scanner.hasNext());
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }

        String data = bufferedReader.readLine();

        StringTokenizer stringTokenizer = new StringTokenizer(data, ",");
        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }

        data = bufferedReader.readLine();
        System.out.println(data);

        stringTokenizer = new StringTokenizer(data, ",");
        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }

        scanner.close();
        bufferedReader.close();

    }
}