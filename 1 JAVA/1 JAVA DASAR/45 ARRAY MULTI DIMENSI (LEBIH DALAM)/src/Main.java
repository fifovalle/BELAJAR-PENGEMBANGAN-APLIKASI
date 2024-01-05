import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] array2D = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        System.out.println(array2D);
        System.out.println(Arrays.toString(array2D));
        System.out.println(array2D[0]);
        System.out.println(array2D[1]);

        System.out.println(Arrays.deepToString(array2D));
        System.out.println("\n");
        char[] arrayChar1 = { 'a', 'b', 'c' };
        char[] arrayChar2 = new char[] { 'd', 'e' };

        char[][] arrayChar2D = {
                arrayChar1,
                arrayChar2
        };

        System.out.println(arrayChar2D);
        System.out.println(System.identityHashCode(arrayChar1));
        System.out.println(System.identityHashCode(arrayChar2));
        System.out.println(Arrays.toString(arrayChar2D));
        System.out.println(Arrays.deepToString(arrayChar2D));
    }
}