package components.Hero;

public class HeroBiasa extends Hero {

    public HeroBiasa(String nama) {
        super(nama);
    }

    public void levelUp() {
        this.setLevel(10);
    }
}
