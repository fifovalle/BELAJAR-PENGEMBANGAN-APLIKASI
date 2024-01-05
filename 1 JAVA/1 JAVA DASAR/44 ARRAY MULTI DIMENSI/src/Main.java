import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // ARRAY 2 DIMENSI
        int[][] array2d = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };
        cetakArray2D(array2d);
        // ARRAY 2D DEKLARASI
        int[][] array2d2 = new int[2][4];
        cetakArray2D(array2d2);
    }

    private static void cetakArray2D(int[][] dataArray) {
        for (int i = 0; i < dataArray.length; i++) {
            System.out.println(Arrays.toString(dataArray[i]));
        }
    }
}