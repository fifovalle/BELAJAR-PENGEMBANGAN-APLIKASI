import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrayAngka = { 1, 4, 5, 6, 7, 8, 9, 5, 4, 3, 2, 7, 9 };
        int[] arrayAngka2 = { 1, 4, 5, 6, 9, 8, 7, 5, 4, 3, 2, 7, 9 };

        // PENJUMLAHAN ANTARA DUA BUAH ARRAY
        int[] arrayHasil = tambahArray(arrayAngka, arrayAngka2);
        cetakArray(arrayAngka, "ARRAY 1");
        cetakArray(arrayAngka2, "ARRAY 2");
        cetakArray(arrayHasil, "HASIL");

        // GABUNGAN ANTARA DUA BUAH ARRAY
        arrayHasil = gabungArray(arrayAngka, arrayAngka2);
        cetakArray(arrayAngka, "ARRAY 1");
        cetakArray(arrayAngka2, "ARRAY 2");
        cetakArray(arrayHasil, "HASIL");

        // REVERSE ARRAY
        arrayHasil = reverseArray(arrayAngka);
        cetakArray(arrayAngka, "ARRAY 1");
        cetakArray(arrayHasil, "HASIL");
    }

    private static int[] tambahArray(int[] dataArray1, int[] dataArray2) {
        int[] arrayHasil = new int[dataArray1.length];
        for (int i = 0; i < dataArray1.length; i++) {
            arrayHasil[i] = dataArray1[i] + dataArray2[i];
        }
        return arrayHasil;
    }

    private static int[] gabungArray(int[] dataArray1, int[] dataArray2) {
        int[] arrayHasil = new int[dataArray1.length + dataArray2.length];
        for (int i = 0; i < dataArray1.length; i++) {
            arrayHasil[i] = dataArray1[i];
        }
        for (int i = 0; i < dataArray2.length; i++) {
            arrayHasil[dataArray1.length + i] = dataArray2[i];
        }
        return arrayHasil;
    }

    private static int[] reverseArray(int[] dataArray) {
        int[] arrayHasil = new int[dataArray.length];
        for (int i = 0; i < dataArray.length; i++) {
            arrayHasil[i] = dataArray[dataArray.length - 1 - i];
        }
        return arrayHasil;
    }

    private static void cetakArray(int[] dataArray, String pesan) {
        System.out.println(pesan + " : " + Arrays.toString(dataArray));
    }
}