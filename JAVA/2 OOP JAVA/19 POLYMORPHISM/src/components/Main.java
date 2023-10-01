package components;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Adul");
        HeroKuat hero2 = new HeroKuat("Komeng");
        hero1.tampil();
        hero2.tampil();

        // POLYMORPHISM
        Hero hero3 = new HeroKuat("Bang");
        hero3.tampil();

        HeroRendah hero4 = new HeroRendah("Naruto");
        hero4.tampil();
        hero4.say();

        // ARRAY LIST
        Hero[] heroes = new Hero[3];
        heroes[0] = hero1;
        heroes[1] = hero2;
        heroes[2] = hero3;

        heroes[0].tampil();
        heroes[1].tampil();
        heroes[2].tampil();
    }
}