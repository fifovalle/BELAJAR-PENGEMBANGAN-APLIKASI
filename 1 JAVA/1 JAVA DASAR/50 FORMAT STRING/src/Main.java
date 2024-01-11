public class Main {
    public static void main(String[] args) {
        // Basic Placeholder: %s and %d
        String nama = "UDIN";
        int umur = 17;
        System.out.printf("NAMA SAYA ADALAH %s UMUR SAYA ADALAH %d\n", nama, umur);

        // Argument Index: %1$s and %2$d
        System.out.printf("%1$s, WAHAI %1$s, KEMANA SAJA KAMU %1$s\n", nama);
        System.out.printf("\nUMUR %1$s berapa?, \n%1$s MENJAWAB: %2$d\nWAH MASIH MUDA YA UMURNYA %2$d\n\n", nama, umur);

        // Flags: %+d
        int int1 = 5;
        int int2 = 8;
        int hasil = int1 - int2;
        System.out.printf("%d - %d = %+d\n", int1, int2, hasil);

        // Width and Precision: %5.2f
        double nilai = 123.45678;
        System.out.printf("NILAI SAYA ADALAH %.2f\n", nilai);

        // Combining Flags, Width, and Precision: %10.4f
        double pi = Math.PI;
        System.out.printf("NILAI PI ADALAH %10.4f\n", pi);

        // Grouping Separator: %,d
        int angka = 1000000;
        System.out.printf("JUMLAH PENDUDUK: %,d\n", angka);

        // Octal and Hexadecimal: %o and %x
        int octalAngka = 42;
        int hexadecimalAngka = 255;
        System.out.printf("OCTAL: %o, HEXADECIMAL: %x\n", octalAngka, hexadecimalAngka);

        // Scientific Notation: %e
        double scientificNotation = 1.23456789e-10;
        System.out.printf("NOTASI ILMIAH: %e\n", scientificNotation);

        // Line Separator: %n
        System.out.printf("BARIS PERTAMA%nBARIS KEDUA%n");

        // Date and Time: %t
        long timestamp = System.currentTimeMillis();
        System.out.printf("WAKTU SEKARANG: %tc\n", timestamp);
    }
}
