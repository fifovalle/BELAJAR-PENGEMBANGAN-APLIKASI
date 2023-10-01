package components;

public class Hero {
    // ATTRIBUTES
    String nama;

    // METHODS
    Hero(String nama) {
        this.nama = nama;
    }

    void tampil() {
        System.out.println("Nama\t\t:" + this.nama);
    }
}
