package components;

class Tampil {
    static String type = "Tampil";
    private String nama;

    Tampil(String nama) {
        this.nama = nama;
    }

    void setType(String type) {
        Tampil.type = type;
    }

    void tampilkan() {
        System.out.println("Nama saya adalah " + this.nama + "\n");
    }
}

public class Main {
    public static void main(String[] args) {

        Tampil tampi1 = new Tampil("Budi");
        tampi1.tampilkan();
        Tampil tampi2 = new Tampil("Caca");
        tampi2.tampilkan();

        tampi1.setType("Monitor");

        // TAMPIlKAN STATIC VARIABLE
        System.out.println("STATIC CLASS :" + tampi1.type);
        System.out.println("STATIC CLASS :" + tampi2.type);
        System.out.println("STATIC CLASS :" + Tampil.type);
    }
}