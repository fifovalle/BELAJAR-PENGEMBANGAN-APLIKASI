package components;

import components.Hero.HeroKuat;
import components.Hero.HeroLemah;

class Main {
    public static void main(String[] args) {
        // MEMBUAT OBJEK DARI KELAS NON ABSTRACT
        HeroKuat hero1 = new HeroKuat("Superman");
        hero1.tampil();

        HeroLemah hero2 = new HeroLemah("Batman");
        hero2.tampil();

        // MEMBUAT OBJEK DARI KELAS ABSTRACT
        // Hero hero3 = new Hero("Batman");
        // hero3.tampil();
    }
}