import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int nilaiAwal, nilaiAkhir, total;
        Scanner masukanPengguna;

        masukanPengguna = new Scanner(System.in);
        System.out.print("MASUKAN NILAI AWAL : ");
        nilaiAwal = masukanPengguna.nextInt();
        System.out.print("MASUKAN NILAI AKHIR : ");
        nilaiAkhir = masukanPengguna.nextInt();
        total = 0;

        while (nilaiAwal <= nilaiAkhir) {
            total = total + nilaiAwal;
            System.out.println("DITAMBAH " + nilaiAwal + " MENJADI " + total);
            nilaiAwal = nilaiAwal + 1;

        }
    }
}