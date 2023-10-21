package components;

public class HeroKuat extends Hero {
    public String type;

    public HeroKuat(String nama, double nyawa) {
        super(nama, nyawa);
        this.type = "Kuat";
    }

    public void tampil() {
        System.out.println(this.getNama() + " Adalah Hero " + this.type);
    }
}
