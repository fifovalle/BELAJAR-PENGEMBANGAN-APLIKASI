package components;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Raman", 100);
        Hero hero2 = new Hero("Naufal", 20);
        HeroLemah hero3 = new HeroLemah("Rizky", 1);
        HeroKuat hero4 = new HeroKuat("Reza", 200);

        // ARRAY SEDERHANA
        Hero[] heroes = new Hero[3];

        heroes[0] = hero1;
        heroes[1] = hero2;
        heroes[2] = hero3;

        for (Hero hero : heroes) {
            hero.tampilkan();
        }

        // ARRAY LIST
        ArrayList<Hero> heroesList = new ArrayList<Hero>();
        heroesList.add(hero1);
        heroesList.add(hero2);
        heroesList.add(hero3);
        heroesList.add(hero4);

        for (Hero hero : heroesList) {
            hero.tampilkan();
        }

        // REFERENSI
        hero4.setNama("Aku");

        for (Hero hero : heroesList) {
            hero.tampilkan();
        }

        for (Hero hero : heroes) {
            hero.tampilkan();
        }
    }
}