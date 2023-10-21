package components;

public class Hero {
    // ATRIBUTE
    String nama;
    double kekuatanSerangan, nyawa;

    // CONSTRUCTOR
    Hero(String nama, double kekuatanSerangan, double nyawa) {
        this.nama = nama;
        this.kekuatanSerangan = kekuatanSerangan;
        this.nyawa = nyawa;
    }

    // METHOD
    void serang(Hero musuh) {
        System.out.println("\n" + this.nama + " serang " + musuh.nama);
        musuh.kenaSerangan(this.kekuatanSerangan);
    }

    void kenaSerangan(double serangan) {
        System.out.println(this.nama + " mendapatkan serangan sebanyak " + serangan);
        this.nyawa -= serangan;
    }

    void tampil() {
        System.out.println("Nama\t\t\t:" + this.nama);
        System.out.println("Kekuatan Serangan\t:" + this.kekuatanSerangan);
        System.out.println("Nyawa\t\t\t:" + this.nyawa);
        System.out.println("\n");
    }
}