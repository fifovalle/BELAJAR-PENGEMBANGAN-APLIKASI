package components;

public class HeroKuat extends Hero {
    // ATTRIBUTES
    String type = "Kuat";

    // METHODS
    HeroKuat(String nama) {
        super(nama);
    }

    @Override
    void tampil() {
        super.tampil();
        System.out.println("Type\t\t:" + this.type);
    }
}
