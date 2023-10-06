package components;

import java.lang.reflect.Field;

import components.hero.HeroLemah;

public class Main {
    public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {

        HeroLemah hero1 = new HeroLemah("Abah", 50);
        hero1.tampilkanSemua();

        // ACCESS MODIFIER
        // hero1.namaPengguna = "Asu";
        // hero1.tampilkanSemua();

        // REFLECTION
        Class<?> classHero1 = hero1.getClass();
        Class<?> classHero2 = hero1.getClass().getSuperclass();
        System.out.println("\nParent Class Hero 1: " + classHero2);
        System.out.println("\nClass Hero 1: " + classHero1);

        // CEK ATRIBUTE DARI OBJEK
        System.out.println("\nIni adalah atribute hero 1\t");
        Field[] fieldsHero1 = classHero1.getFields();
        System.out.println(fieldsHero1[0].getName());

        // CEK ATRAUTE SEMUA
        System.out.println("\nIni adalah atribute semua\t");
        Field[] fieldsHero2 = classHero1.getDeclaredFields();
        System.out.println(fieldsHero1.length);
        for (Field field : fieldsHero2) {
            System.out.println(field.getName());
        }

        // UBAH NILAI
        System.out.println("\n UBAH NILAI NYAWA");
        hero1.tampilkanSemua();
        System.out.println("JADI");
        // fieldsHero2[0].set(hero1,value:"KAKEK");
    }
}