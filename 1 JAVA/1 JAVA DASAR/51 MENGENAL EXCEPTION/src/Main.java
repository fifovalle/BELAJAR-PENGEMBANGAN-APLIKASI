import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = { 0, 1, 2, 3 };
        Scanner masukanPengguna = new Scanner(System.in);
        FileInputStream fileMasukan = null;
        System.out.print("MASUKAN NILAI ARRAY KE : ");
        int index = masukanPengguna.nextInt();

        // // EXEPTION HANDLING
        // try {
        // System.out.println("INDEX KE " + index + " ADALAH " + array[index]);
        // } catch (Exception e) {
        // System.err.println("ERROR : " + e);
        // }

        // try {
        // fileMasukan = new FileInputStream("file.txt");
        // } catch (IOException e) {
        // System.err.println("ERROR : " + e);
        // }

        // MENGGABUNGKAN DUA EXEPTION
        try {
            System.out.println("INDEX KE  " + index + " ADALAH " + array[index]);
            fileMasukan = new FileInputStream("file.txt");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("INDEX YANG ADA MASUKAN TIDAK SESUAI DENGAN JUMLAH ARRAY");
        } catch (IOException e) {
            System.err.println("FILE TIDAK ADA");
        } finally {
            System.out.println("SELESAI");
        }

        System.out.println("AKHIR PROGRAM");
    }
}