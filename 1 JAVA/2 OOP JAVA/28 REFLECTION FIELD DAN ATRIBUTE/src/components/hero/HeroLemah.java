package components.hero;

public class HeroLemah extends Hero {
    public String namaPengguna;
    private String tipeHero = "Lemah";

    public HeroLemah(String nama, double nyawa) {
        super(nama, nyawa);
    }

    public void tampilkanSemua() {
        this.tampilkan();
        System.out.println("Tipe Hero\t: " + this.tipeHero);
        System.out.println("Nama Pengguna\t: " + this.namaPengguna);
    }
}
