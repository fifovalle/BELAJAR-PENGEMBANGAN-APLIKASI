public class Main {
    public static void main(String[] args) {
        // PROGRAM UNTUK KONVERSI DATA
        int nilaiInt = 256; // 32 BIT
        System.out.println("NILAI INT = " + nilaiInt);

        // MEMPERLUAS RENTANG KE TIPE DATA YANG LEBIH BESAR
        long nilaiIntL = nilaiInt;
        System.out.println("NILAI LONG = " + nilaiIntL);

        // MEMPERKECILKAN RENTANG KE TIPE DATA YANG LEBIH KECIL
        byte nilaiByte = (byte) nilaiInt;
        System.out.println("NILAI BYTE = " + nilaiByte);
        System.out.println("NILAI MAX BYTE = " + Byte.MAX_VALUE);
        System.out.println("NILAI MIN BYTE = " + Byte.MIN_VALUE);

        // CASTING PEMBAGIAN
        byte a = 10;
        float b = 4;
        float c = a / b;
        System.out.println("NILAI C = " + c);

        int x = 10;
        int y = 4;
        float z = (float) x / y;
        System.out.println("NILAI Z = " + z);
    }
}