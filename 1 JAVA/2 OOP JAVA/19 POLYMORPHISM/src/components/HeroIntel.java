package components;

public class HeroIntel extends Hero {
    // ATTRIBUTES
    String type = "Intel";

    // METHODS
    HeroIntel(String nama) {
        super(nama);
    }

    @Override
    void tampil() {
        super.tampil();
        System.out.println("Type\t\t:" + this.type);
    }
}
