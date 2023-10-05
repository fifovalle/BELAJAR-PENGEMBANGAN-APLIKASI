package components.Hero;

// INHERITANCE DARI ABSTRACT HERO
public class HeroKuat extends Hero {

    public HeroKuat(String nama) {
        super(nama);
    }

    public void levelUp() {
        this.setLevel(3);
    }
}
