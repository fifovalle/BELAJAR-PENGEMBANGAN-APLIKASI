package components.Hero;

public class HeroLemah extends Hero {
    private String heroTipe = "Lemah";
    private String namapengguna;

    public HeroLemah(String nama, double nyawa) {
        super(nama, nyawa);
    }

    public void tampilkanSemua() {
        this.tampilkan();
        System.out.println("Tipe Hero\t: " + this.heroTipe);
        System.out.println("Nama Pengguna\t: " + this.namapengguna);
    }

    private void setTipeHero(String heroTipe) {
        this.heroTipe = heroTipe;
    }

    private void setNamaPengguna(String namapengguna) {
        this.namapengguna = namapengguna;
    }
}
