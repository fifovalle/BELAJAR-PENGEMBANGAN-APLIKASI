package components;

import java.util.ArrayList;

class Pemain {
    private static int jumlahPemain;
    private static ArrayList<String> daftarPemain = new ArrayList<String>();
    private String nama;

    Pemain(String nama) {
        this.nama = nama;
        Pemain.jumlahPemain++;
        Pemain.daftarPemain.add(this.nama);
    }

    void tampilkan() {
        System.out.println("Nama\t\t:" + this.nama);
    }

    static void tampilkanJumlah() {
        System.out.println("Jumlah pemain\t:" + Pemain.jumlahPemain);
    }

    static ArrayList<String> getPemain() {
        return Pemain.daftarPemain;
    }
}

public class Main {
    public static void main(String[] args) {
        Pemain pemain1 = new Pemain("Budi");
        Pemain pemain2 = new Pemain("Raihan");
        Pemain pemain3 = new Pemain("Joko");
        Pemain pemain4 = new Pemain("Agus");

        Pemain.tampilkanJumlah();
        System.out.println("Daftar pemain\t:" + Pemain.getPemain());
    }
}