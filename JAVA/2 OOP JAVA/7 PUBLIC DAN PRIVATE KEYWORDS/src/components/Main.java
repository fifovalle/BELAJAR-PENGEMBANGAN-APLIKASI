package components;

class Pemain {
    String nama;
    public int pengalaman;
    private int darah;

    Pemain(String nama, int pengalaman, int darah) {
        this.nama = nama;
        this.pengalaman = pengalaman;
        this.darah = darah;
    }

    // DEFALUT MODIFIER ACCESS
    void tampil() {
        ubahDarah();
        System.out.println("\nNama : " + this.nama);
        System.out.println("pengalaman : " + this.pengalaman);
        System.out.println("darah : " + this.darah);
    }

    // PUBLIC MODIFIER ACCESS
    public void ubahNama(String nama) {
        this.nama = nama;
    }

    // PRIVATE MODIFIER ACCESS
    private void ubahDarah() {
        this.darah += 100;
    }
}

public class Main {
    public static void main(String[] args) {

        Pemain pemain1 = new Pemain("Budi", 0, 100);
        System.out.println(pemain1.nama);
        pemain1.nama = "Bangsa";
        System.out.println(pemain1.nama);

        // PUBLIC
        System.out.println(pemain1.pengalaman);
        pemain1.pengalaman = 100;
        System.out.println(pemain1.pengalaman);

        // PRIVATE (Tidak Bisa Di Akses)
        // System.out.println(pemain1.darah);
        // pemain1.darah = 200;
        // System.out.println(pemain1.darah);

        // METHODS

        // DEFAULT
        pemain1.tampil();

        // PUBLIC
        pemain1.ubahNama("Teddy");
        pemain1.tampil();

        // PRIVATE
        // pemain1.ubahDarah();
    }
}