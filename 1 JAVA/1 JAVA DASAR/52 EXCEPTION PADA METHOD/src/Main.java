import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arrayData = { 0, 1, 2, 3 };
        Scanner scanner = new Scanner(System.in);
        System.out.print("DATA KE : ");
        int indexMasukan = scanner.nextInt();

        int data = ambilDataDariArray(arrayData, indexMasukan);
        System.out.println("DATA DARI ARRAY KE " + indexMasukan + " ADALAH " + data);
        int data2 = 0;
        try {
            data = ambilData(arrayData, indexMasukan);
        } catch (Exception e) {
            System.err.println("DATA TIDAK ADA");
        }
        System.out.println("DATA DARI ARRAY KE " + indexMasukan + " ADALAH " + data2);

        System.err.println("PROGRAM SELESAI");
    }

    public static int ambilData(int[] array, int index) throws Exception {
        int hasil = array[index];
        return hasil;
    }

    public static int ambilDataDariArray(int[] arrayData, int indexMasukan) {
        int hasil = 0;
        try {
            hasil = arrayData[indexMasukan];
        } catch (Exception e) {
            System.err.println("DATA TIDAK ADA");
        }
        return hasil;
    }
}