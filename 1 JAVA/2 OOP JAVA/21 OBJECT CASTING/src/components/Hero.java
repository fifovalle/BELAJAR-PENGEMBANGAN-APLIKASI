package components;

public class Hero {
    private String nama;
    private double nyawa;

    Hero(String nama, double nyawa) {
        this.nama = nama;
        this.nyawa = nyawa;
    }

    // Getter
    public double getNyawa() {
        return this.nyawa;
    }

    public String getNama() {
        return this.nama;
    }

    // Setter
    public void setNyawa(double nyawa) {
        this.nyawa = nyawa;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Method
    public void tampil() {
        System.out.println(this.nama + " Adalah regular hero");
    }
}
