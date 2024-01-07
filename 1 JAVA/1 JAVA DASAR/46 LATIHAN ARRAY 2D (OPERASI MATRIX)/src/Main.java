public class Main {
    public static void main(String[] args) {
        System.out.println('\n');

        int[][] matrixA = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int[][] matrixB = {
                { 11, 12, 13 },
                { 14, 15, 16 },
                { 17, 18, 19 }
        };

        cetakArray(matrixA);
        cetakArray(matrixB);

        int[][] hasilTambah = tambahMatrix(matrixA, matrixB);
        cetakArray(hasilTambah);

        int[][] hasilKali = kaliMatrix(matrixA, matrixB);
        cetakArray(hasilKali);

    }

    private static int[][] kaliMatrix(int[][] matrixA, int[][] matrixB) {
        int barisA = matrixA.length;
        int kolomA = matrixA[0].length;
        int barisB = matrixB.length;
        int kolomB = matrixB[0].length;

        int[][] hasil = new int[barisA][kolomB];
        int buffer;
        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomB; j++) {
                buffer = 0;
                for (int k = 0; k < kolomA; k++) {
                    buffer += matrixA[i][k] * matrixB[k][j];
                }
                hasil[i][j] = buffer;
            }
        }
        return hasil;
    }

    private static int[][] tambahMatrix(int[][] matrixA, int[][] matrixB) {
        int barisA = matrixA.length;
        int kolomA = matrixA[0].length;
        int barisB = matrixB.length;
        int kolomB = matrixB[0].length;

        int[][] hasil = new int[barisA][kolomA];
        if (barisA == barisB && kolomA == kolomB) {
            for (int i = 0; i < barisA; i++) {
                for (int j = 0; j < kolomA; j++) {
                    hasil[i][j] = matrixA[i][j] + matrixB[i][j];
                }
            }
        } else {
            System.out.println("JUMLAH BARI ATAU KOLOM TIDAK SAMA");
        }
        return hasil;
    }

    private static void cetakArray(int[][] dataArray) {
        int baris = dataArray.length;
        int kolom = dataArray[0].length;

        for (int i = 0; i < baris; i++) {
            System.out.print("[");
            for (int j = 0; j < kolom; j++) {
                System.out.print(dataArray[i][j]);
                if (j < (kolom - 1)) {
                    System.out.print(",");
                } else {
                    System.out.print("]");
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}