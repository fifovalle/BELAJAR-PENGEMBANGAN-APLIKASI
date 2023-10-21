package components;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Raihan", 100);
        HeroKuat hero2 = new HeroKuat("Budi", 50);

        hero1.tampil();
        hero2.tampil();

        System.out.println(hero1.getNyawa());
        System.out.println(hero2.getNyawa());

        hero1.setNyawa(200);
        hero2.setNyawa(100);
        hero1.tampil();
        hero2.tampil();

    }
}