package components;

public class HeroRendah extends Hero {
    // ATTRIBUTES
    String type = "Rendah";

    // METHODS
    HeroRendah(String nama) {
        super(nama);
    }

    @Override
    void tampil() {
        super.tampil();
        System.out.println("Type\t\t:" + this.type);
    }

    void say() {
        System.out.println("Hello");
    }
}
