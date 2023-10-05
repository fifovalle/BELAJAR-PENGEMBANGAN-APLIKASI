package components;

import components.Hero.HeroKuat;

public class Main {
    public static void main(String[] args) {
        HeroKuat hero1 = new HeroKuat("Iron Man");

        hero1.tampil();

        hero1.setNama("Thor");
        hero1.tampil();
    }
}