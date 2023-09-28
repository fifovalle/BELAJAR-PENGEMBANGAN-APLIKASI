package components;

// CLASS TANPA CONSTRUCTOR
class Pegawai {
    String nama;
    int gaji;
}

// CLASS DENGAN CONSTRUCTOR
class Mahasiswa {
    String nama;
    int nim;

    // CONSTRUCTOR TANPA PARAMETER
    // Mahasiswa() {
    // System.out.println("Ini adalah konstruktor Mahasiswa");
    // }

    // CONSTRUCTOR DENGAN PARAMETER
    Mahasiswa(String masukanNama, int masukanNim) {
        nama = masukanNama;
        nim = masukanNim;

        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
    }
}

public class Main {
    public static void main(String[] args) {

        new Mahasiswa("Budi", 123);
        new Mahasiswa("Ahmad", 123456);

        // Pegawai objekpegawai = new Pegawai();
        // objekpegawai.nama = "Budi";
        // objekpegawai.gaji = 100000;

        // System.out.println(objekpegawai.nama);
        // System.out.println(objekpegawai.gaji);
    }
}
