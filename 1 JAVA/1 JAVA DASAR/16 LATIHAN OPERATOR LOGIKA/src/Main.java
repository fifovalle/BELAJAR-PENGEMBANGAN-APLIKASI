import java.util.*;

public class Main {
    public static void main(String[] args) {
        // SEBUAH OBJEK UNTUK MENANGKAP INPUT USER
        Scanner masukanPengguna = new Scanner(System.in);

        // SEBUAH PROGRAM SEDERHANA UNTUK MENEBAK SEBUAH ANGKA
        int nilaiBenar = 6;
        int nilaiTebakan;
        boolean statusTebakan;
        System.out.print("Masukan Nilai Tebakan : ");
        nilaiTebakan = masukanPengguna.nextInt();
        System.out.println("Nilai tebakan anda adalah " + nilaiTebakan);

        // OPERASI LOGIKA
        statusTebakan = (nilaiTebakan == nilaiBenar);
        System.out.println("Tebakan anda " + (statusTebakan ? "Benar" : "Salah"));

        // OPERASI ALJABAR BOOLEAN (AND, OR)
        System.out.println("Masukan Nilai Di Antara 4 dan 9");
        System.out.print("Masukan Nilai Tebakan : ");
        nilaiTebakan = masukanPengguna.nextInt();
        statusTebakan = (nilaiTebakan > 4) && (nilaiTebakan < 9);
        System.out.println("Tebakan anda " + (statusTebakan ? "Benar" : "Salah"));
    }
}