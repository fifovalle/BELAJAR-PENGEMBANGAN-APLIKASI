package components;

public class Hero {
    private String nama;
    private double hp;

    Hero(String nama, double hp) {
        this.nama = nama;
        this.hp = hp;
    }

    void setNama(String nama) {
        this.nama = nama;
    }

    void tampilkan() {
        System.out.println("Nama : " + this.nama + "Dengan hp : " + this.hp);
    }

    public String toString() {
        return "Hero" + this.nama;
    }
}
