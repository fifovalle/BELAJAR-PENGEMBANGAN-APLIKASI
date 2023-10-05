package components;

import components.Hero.HeroBiasa;
import components.Hero.HeroKuat;
import components.Hero.HeroLemah;

class Main {
    public static void main(String[] args) {
        // MEMBUAT OBJEK DARI KELAS NON ABSTRACT
        HeroKuat hero1 = new HeroKuat("Superman");
        hero1.tampil();

        HeroLemah hero2 = new HeroLemah("Batman");
        hero2.tampil();

        hero1.levelUp();
        hero2.levelUp();
        hero1.tampil();
        hero2.tampil();

        HeroBiasa hero3 = new HeroBiasa("Spiderman");
        hero3.tampil();
        hero3.levelUp();
        hero3.tampil();
    }
}