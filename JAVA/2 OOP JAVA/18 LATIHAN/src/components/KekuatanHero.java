package components;

public class KekuatanHero extends Hero {
    String type = "KekuatanHero";

    // SUBCLASS CONSTRUCTOR
    KekuatanHero(String nama, double kekuatanSerangan, double nyawa) {
        super(nama, kekuatanSerangan, nyawa);
    }

    @Override
    void tampil() {
        super.tampil();
        System.out.println("Type\t\t\t:" + this.type);
    }

    @Override
    void kenaSerangan(double serangan) {
        System.out.println(this.nama + " mendapatkan setengah serangan sebanyak " + serangan + "->" + 0.5 * serangan);
        this.nyawa -= 0.5 * serangan;
    }
}
