package components;

// PEMAIN
class Pemain {
    String nama;
    double darah;
    int level;
    // OBJEK PEMAIN
    Senjata senjata;
    Jirah jirah;

    // CONSTRUCTOR PEMAIN
    Pemain(String nama, double darah) {
        this.nama = nama;
        this.darah = darah;
    }

    // METHOD PEMAIN
    void serang(Pemain musuh) {
        double kekuatanSerangan = this.senjata.kekuatanSerangan;
        System.out.println(this.nama + " menyerang " + musuh.nama + " dengan kekuatan serangan " + kekuatanSerangan);

        musuh.bertahan(kekuatanSerangan);
    }

    void bertahan(double kekuatanSerangan) {

        double sakitnya;
        if (this.jirah.kekuatanBertahan < kekuatanSerangan) {
            sakitnya = kekuatanSerangan - this.jirah.kekuatanBertahan;
        } else {
            sakitnya = 0;
        }
        this.darah -= sakitnya;
        System.out.println(this.nama + "mendapatkan serangan " + sakitnya);

    }

    void gunakanSenjata(Senjata senjata) {
        this.senjata = senjata;
    }

    void gunakanJirah(Jirah jirah) {
        this.jirah = jirah;
    }

    void tampilPemain() {
        System.out.println("\nNama : " + this.nama + "\nDarah : " + this.darah);
        this.senjata.tampilSenjata();
        this.jirah.tampilJirah();
    }
}

// SENJATA
class Senjata {
    double kekuatanSerangan;
    String jenisSenjata;

    // CONSTRUCTOR SENJATA
    Senjata(String jenisSenjata, double kekuatanSerangan) {
        this.jenisSenjata = jenisSenjata;
        this.kekuatanSerangan = kekuatanSerangan;
    }

    void tampilSenjata() {
        System.out.println("\nJenis Senjata : " + this.jenisSenjata + "\nKekuatan Serangan : " + this.kekuatanSerangan);
    }
}

// JIRAH
class Jirah {
    double kekuatanBertahan;
    String jenisJirah;

    // CONSTRUCTOR JIRAH
    Jirah(String jenisJirah, double kekuatanBertahan) {
        this.jenisJirah = jenisJirah;
        this.kekuatanBertahan = kekuatanBertahan;
    }

    void tampilJirah() {
        System.out.println("\nJenis Jirah : " + this.jenisJirah + "\nKekuatan Bertahan : " + this.kekuatanBertahan);
    }
}

public class Main {
    public static void main(String[] args) {

        // MEMBUAT OBJEK PEMAIN
        Pemain naufal = new Pemain("Naufal", 100);
        Pemain yusuf = new Pemain("Yusuf", 50);
        // MEMBUAT OBJEK SENJATA
        Senjata pisau = new Senjata("pisau", 50);
        Senjata ketapel = new Senjata("ketapel", 100);
        // MEMBUAT OBJEK JIRAH
        Jirah kaos = new Jirah("kaos", 5);
        Jirah kain = new Jirah("kain", 10);

        // MEMANGGIL METHOD
        naufal.gunakanSenjata(pisau);
        naufal.gunakanJirah(kaos);
        naufal.tampilPemain();

        yusuf.gunakanSenjata(ketapel);
        yusuf.gunakanJirah(kain);
        yusuf.tampilPemain();

        System.out.println("\n PERTEMPURAN");
        naufal.serang(yusuf);
        naufal.tampilPemain();
    }
}
