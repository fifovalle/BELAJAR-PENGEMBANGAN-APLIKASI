package components;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Spiderman", 100);
        Hero hero2 = new Hero("Batman", 100);
        HeroLemah hero3 = new HeroLemah("Superman", 40);
        HeroKuat hero4 = new HeroKuat("Ironman", 100);

        ArrayList<Hero> heroes = new ArrayList<>();
        // OPERASI PENAMBAHAN
        System.out.println("\nOPERASI PENAMBAHAN");
        heroes.add(hero1);
        heroes.add(hero2);
        heroes.add(hero3);
        heroes.add(hero4);
        System.out.println(heroes);
        // OPERASI MERUBAHAH
        System.out.println("\nOPERASI MERUBAHAH");
        heroes.set(0, hero4);
        System.out.println(heroes);
        // OPERASI MENGHAPUS
        System.out.println("\nOPERASI MENGHAPUS");
        heroes.remove(0);
        System.out.println(heroes);
        // OPERASI MENGAKSES
        System.out.println("\nOPERASI MENGAKSES");
        System.out.println(heroes);
        Hero ambil = heroes.get(0);
        System.out.println(heroes);
        ambil.tampilkan();
        // METHOD PADA ARRAYLIST
        System.out.println("\nMETHOD PADA ARRAYLIST");
        System.out.println("1. size()\t: " + heroes.size());
        System.out.println("2. isEmpty()\t: " + heroes.isEmpty());
        System.out.println("3. contains()\t: " + heroes.contains(hero2));
        System.out.println("   contains()\t: " + heroes.contains(hero1));
        System.out.println("4. indexOf()\\t: " + heroes.indexOf(hero4));
    }
}