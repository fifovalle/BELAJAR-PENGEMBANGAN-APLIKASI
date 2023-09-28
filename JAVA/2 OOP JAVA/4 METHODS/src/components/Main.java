package components;

class Pegawai {
    // DATA MEMBER
    String nama;
    String gaji;

    // CONSTRUCTOR
    Pegawai(String nama, String gaji) {
        this.nama = nama;
        this.gaji = gaji;
        // System.out.println("Nama : " + this.nama + "\nGaji : " + this.gaji);
    }

    // METHOD TANPA RETURN DAN TANPA PARAMETER
    void tampil() {
        System.out.println("Nama : " + this.nama + "\nGaji : " + this.gaji);
    }

    // METHOD TANPA RETURN DAN DENGAN PARAMETER
    void aturNama(String nama) {
        this.nama = nama;
    }

    // METHOD DENGAN RETURN DAN TANPA PARAMETER
    String ambilGaji() {
        return this.gaji;
    }

    String ambilNama() {
        return this.nama;
    }

    // METHOD DENGAN RETURN DAN DENGAN PARAMETER
    String Halo(String pesan) {
        return pesan + " Juga, nama saya adalah " + this.nama;
    }
}

public class Main {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Pegawai("Budi", "Rp 1.500.000");
        // MENGAKSES METHOD TANPA PARAMETER
        pegawai1.tampil();
        // MENGAKSES METHOD DENGAN PARAMETER
        pegawai1.aturNama("Iwan");
        pegawai1.tampil();
        // MENGAKSES METHOD DENGAN RETURN TANPA PARAMETER
        System.out.println(pegawai1.ambilGaji());
        System.out.println(pegawai1.ambilNama());
        // MENGAKSES METHOD DENGAN RETURN DAN PARAMETER
        String data = pegawai1.Halo("Halo");
        System.out.println(data);
    }
}
