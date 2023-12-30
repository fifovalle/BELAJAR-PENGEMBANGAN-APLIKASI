import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner masukanPengguna = new Scanner(System.in);
        int nilai;

        System.out.print("MASUKAN NILAI : ");
        nilai = masukanPengguna.nextInt();
        System.out.println("NILAI ANDA ADALAH : " + nilai);

        cetakNilai(nilai);
        jumlahNilai(nilai);
    }

    private static int jumlahNilai(int nilai) {
        System.out.println("PARAMETER NILAI : " + nilai);
        if (nilai == 0) {
            return 0;
        }
        return nilai + jumlahNilai(nilai - 1);
    }

    private static void cetakNilai(int nilai) {
        System.out.println("NILAI ANDA ADALAH : " + nilai);
        if (nilai == 0) {
            return;
        }
        nilai--;
        cetakNilai(nilai);
    }
}