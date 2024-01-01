public class Main {
    public static void main(String[] args) {

        int hasilInteger;
        hasilInteger = tambah(10, 20);
        cetakAngka(hasilInteger);

        float hasilFloat;
        hasilFloat = tambah(10.5f, 20.5f);
        cetakAngka(hasilFloat);

        double angkaDouble;
        angkaDouble = tambah(10.5d, 20.5d);
        cetakAngka(angkaDouble);

        cetakAngka(10);
        cetakAngka(10.5f);
        cetakAngka(16.7d);
        cetakAngka(16);
    }

    private static int tambah(int angkaPertama, int angkaKedua) {
        return angkaPertama + angkaKedua;
    }

    private static float tambah(float angkaPertama, float angkaKedua) {
        return angkaPertama + angkaKedua;
    }

    private static double tambah(double angkaPertama, double angkaKedua) {
        return angkaPertama + angkaKedua;
    }

    private static void cetakAngka(double angkaDouble) {
        System.out.println("ANGKA INI ADALAH DOUBLE DENGAN NILAI = " + angkaDouble);
    }

    private static void cetakAngka(float angkaFloat) {
        System.out.println("ANGKA INI ADALAH FLOAT DENGAN NILAI = " + angkaFloat);
    }

    private static void cetakAngka(int angkaInteger) {
        System.out.println("ANGKA INI ADLAAH INTEGER DENGAN NILAI = " + angkaInteger);
    }
}