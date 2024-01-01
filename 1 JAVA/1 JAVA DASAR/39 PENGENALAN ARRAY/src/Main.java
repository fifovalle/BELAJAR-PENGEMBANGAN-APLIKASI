import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("ASSIGNMENT ARRAY");
        int[] arrayInteger = { 1, 2, 3, 4, 5 };
        System.out.println(arrayInteger[0]);
        System.out.println(arrayInteger[1]);
        System.out.println(arrayInteger[2]);
        System.out.println(arrayInteger[3]);

        System.out.println("DEKLARASI ARRAY");
        float[] arrayFloat = new float[5];

        arrayFloat[2] = 1.1f;

        System.out.println(arrayFloat[0]);
        System.out.println(arrayFloat[1]);
        System.out.println(arrayFloat[2]);
        System.out.println(arrayFloat[3]);
        System.out.println(arrayFloat[4]);
        System.out.println(arrayFloat[5]);

        System.out.println(Arrays.toString(arrayFloat));
        System.out.println(Arrays.toString(arrayInteger));
    }
}