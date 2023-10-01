package components;

public class Pemain {
    private String nama;
    private static int jumlahPemain;

    // OVERLOADING CONSTRUCTOR
    // OPSI 1
    Pemain(String nama) {
        Pemain.jumlahPemain++;
        this.nama = nama;
    }

    // OPSI 2
    Pemain() {
        Pemain.jumlahPemain++;
        this.nama = "Pemain " + Pemain.jumlahPemain;
    }

    void Tampilkan() {
        System.out.println("Nama\t:" + this.nama);
    }
}
