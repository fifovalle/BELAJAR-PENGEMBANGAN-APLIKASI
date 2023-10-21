package components;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Adul", 10, 100);
        KekuatanHero hero2 = new KekuatanHero("Komeng", 20, 100);
        hero1.tampil();
        hero2.tampil();

        hero1.serang(hero2);

        hero1.tampil();
        hero2.tampil();
    }
}