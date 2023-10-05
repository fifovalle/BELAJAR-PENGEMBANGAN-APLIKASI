package components.Hero;

public class HeroKuat extends Hero {

    public HeroKuat(String nama) {
        super(nama);
    }

    public void tampil() {
        System.out.println("nama: " + this.nama);
    }

    @Override
    public void setNama(String nama) {
        super.setNama(nama);
    }
}
