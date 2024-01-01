import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arrayAngka[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println("ARRAY MANUAL ");
        for (int i = 0; i < 10; i++) {
            System.out.println("INDEX KE - " + i + " : " + arrayAngka[i]);
        }

        System.out.println("ARRAY LENGHT ");
        for (int i = 0; i < arrayAngka.length; i++) {
            System.out.println("INDEX KE - " + i + " : " + arrayAngka[i]);
        }

        System.out.println("ARRAY FOREACH ");
        for (int angka : arrayAngka) {
            System.out.println("ANGKA : " + angka);
        }
    }
}