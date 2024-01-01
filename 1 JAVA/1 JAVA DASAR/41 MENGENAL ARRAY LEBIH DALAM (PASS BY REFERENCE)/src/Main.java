import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrayAngka1 = { 1, 2, 3, 4, 5 };
        int[] arrayAngka2 = new int[5];

        arrayAngka2 = arrayAngka1;
        System.out.println("ARRAY 1 -> " + Arrays.toString(arrayAngka1));
        System.out.println("ARRAY 2 -> " + Arrays.toString(arrayAngka2));

        arrayAngka1[0] = 100;
        arrayAngka2[0] = 400;
        System.out.println("ARRAY 1 -> " + Arrays.toString(arrayAngka1));
        System.out.println("ARRAY 2 -> " + Arrays.toString(arrayAngka2));

        ubahArray(arrayAngka1);
        System.out.println("ARRAY 1 -> " + Arrays.toString(arrayAngka1));
        System.out.println("ARRAY 2 -> " + Arrays.toString(arrayAngka2));

    }

    private static void ubahArray(int[] array) {
        array[0] = 125;
    }
}