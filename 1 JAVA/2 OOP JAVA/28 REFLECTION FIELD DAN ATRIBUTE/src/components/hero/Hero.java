package components.hero;

public abstract class Hero {
    private String nama;
    private double nyawa;

    Hero(String nama, double nyawa) {
        this.nama = nama;
        this.nyawa = nyawa;
    }

    void tampilkan() {
        System.out.println("Hero\t\t: " + this.nama);
        System.out.println("Nyawa\t\t: " + this.nyawa);
    }
}
