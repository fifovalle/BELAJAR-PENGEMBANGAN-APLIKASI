package components.Hero;

public class HeroLemah extends Hero {

    public HeroLemah(String nama) {
        super(nama);
    }

    public void levelUp() {
        this.setLevel(2);
    }
}
