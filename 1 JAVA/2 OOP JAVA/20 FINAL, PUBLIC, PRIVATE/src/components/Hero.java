package components;

public class Hero {
    public String Nama;
    private double Nyawa;

    Hero(String Nama, double Nyawa) {
        this.Nama = Nama;
        this.Nyawa = Nyawa;
    }

    public double getNyawa() {
        return this.Nyawa;
    }

    final void setNyawa(double Nyawa) {
        this.Nyawa = Nyawa;
    }

    public void tampil() {
        System.out.println(this.Nama + " Memiliki " + this.Nyawa + " Nyawa");
    }
}
