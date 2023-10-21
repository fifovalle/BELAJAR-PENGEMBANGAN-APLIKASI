package components;

public class Main {
    public static void main(String[] args) {

        // CASTING
        // double angka = 1.5;
        // int angka2 = (int) angka;

        // System.out.println(angka2);

        // OBJECT DENGAN CLASS HEROKUAT
        HeroKuat hero = new HeroKuat("Ben", 100);
        hero.tampil();

        // UP CASTING
        Hero heroup = (Hero) hero;
        heroup.tampil();

        // DOWN CASTING
        // Hero hero2 = new Hero("Aditya", 100);
        // hero2.tampil();

        // HeroCupu herodown = (HeroCupu) hero2;
        // herodown.tampil();

        HeroKuat hero2 = (HeroKuat) heroup;
        hero2.tampil();

    }
}