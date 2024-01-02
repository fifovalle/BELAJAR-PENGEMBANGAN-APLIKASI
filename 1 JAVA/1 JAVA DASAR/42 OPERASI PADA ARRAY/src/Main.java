import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrayAngka1 = { 1, 2, 3, 4, 5 };
        int[] arrayAngka2 = new int[arrayAngka1.length];

        System.out.println("MERUBAH ARRAY JADI STRING");
        cetakArray(arrayAngka1);

        System.out.println("MENGOPI DENGAN LOOP");
        for (int i = 0; i < arrayAngka1.length; i++) {
            arrayAngka2[i] = arrayAngka1[i];
        }

        cetakArray(arrayAngka1);
        System.out.println("ARRAY 1 = " + Arrays.toString(arrayAngka1));
        cetakArray(arrayAngka2);
        System.out.println("ARRAY 2 = " + Arrays.toString(arrayAngka2));

        System.out.println("MENGOPI DENGAN COPYOFRANGE");
        int[] arrayAngka3 = Arrays.copyOfRange(arrayAngka1, 1, 5);
        cetakArray(arrayAngka3);
        System.out.println("ARRAY 3 = " + Arrays.toString(arrayAngka3));

        System.out.println("MENGISI ARRAY DENGAN NILAI TERTENTU");
        Arrays.fill(arrayAngka2, 10);
        cetakArray(arrayAngka2);
        System.out.println("ARRAY 2 SETELAH DIISI = " + Arrays.toString(arrayAngka2));

        System.out.println("MENGGABUNGKAN ARRAY");
        int[] arrayGabung = new int[arrayAngka1.length + arrayAngka3.length];
        System.arraycopy(arrayAngka1, 0, arrayGabung, 0, arrayAngka1.length);
        System.arraycopy(arrayAngka3, 0, arrayGabung, arrayAngka1.length, arrayAngka3.length);
        cetakArray(arrayGabung);
        System.out.println("ARRAY GABUNGAN = " + Arrays.toString(arrayGabung));

        System.out.println("MENGECEK KESEJAJARAN DUA ARRAY");
        boolean isEqual = Arrays.equals(arrayAngka1, arrayAngka2);
        System.out.println("Apakah ARRAY 1 sama dengan ARRAY 2? " + isEqual);

        System.out.println("MENGURUTKAN ARRAY");
        Arrays.sort(arrayAngka1);
        cetakArray(arrayAngka1);
        System.out.println("ARRAY 1 SETELAH DIURUTKAN = " + Arrays.toString(arrayAngka1));
    }

    private static void cetakArray(int[] dataArray) {
        System.out.println("ARRAY = " + Arrays.toString(dataArray));
    }
}
