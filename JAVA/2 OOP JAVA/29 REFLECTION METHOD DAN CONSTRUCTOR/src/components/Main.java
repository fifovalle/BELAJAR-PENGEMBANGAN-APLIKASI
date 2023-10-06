package components;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import components.Hero.HeroLemah;

public class Main {
    public static void main(String[] args)
            throws IllegalAccessException, IllegalAccessException, InvocationTargetException {
        HeroLemah hero1 = new HeroLemah("Raihan", 0);
        hero1.tampilkanSemua();

        System.out.println("\nAMBIL SELURUH METHOD\n");
        Method[] methodHero1 = hero1.getClass().getMethods();
        for (Method method : methodHero1) {
            if (method.getName().equals("setTipeHero")) {
                System.out.println("MENINVOKASI METHOD");
                method.setAccessible(true);
                method.invoke(hero1, "Kuat");
            }
        }
        hero1.tampilkanSemua();
    }

}