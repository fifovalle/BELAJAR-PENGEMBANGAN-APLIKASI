package components;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Naufal");
        hero1.tampil();

        Object hero2 = hero1;
        String hero_str = hero2.toString();
        System.out.println(hero_str);

        System.out.println(hero1.equals(hero2));

        Hero hero3 = new Hero("Reza");
        Hero hero4 = new Hero("Reza");
        Hero hero5 = new Hero("Reza");
        System.out.println(hero3.equals(hero4));

        Lemah hero6 = new Lemah("Ara");

    }
}