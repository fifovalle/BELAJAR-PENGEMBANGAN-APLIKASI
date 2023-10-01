package components;

public class KekuatanHero extends Hero {
    double kekuatanBertahan;

    void tampil() {
        // OVERRIDING METHOD
        System.out.println("Nama\t\t:" + this.nama);
        System.out.println("Kekuatan\t:" + this.kekuatanBertahan);
    }
}
