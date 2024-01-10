public class Main {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("HALLO");
        cetakData(builder);

        // APPEND
        builder.append(" SEMUANYA");
        cetakData(builder);

        builder.append(" WARGA BANDUNG");
        cetakData(builder);

        // INSERT
        builder.insert(20, " KOTA ");
        cetakData(builder);

        // DELETE
        builder.delete(20, 25);
        cetakData(builder);

        // RUBAH KARAKTER PADA INDEX TERTENTU
        builder.setCharAt(27, '!');
        cetakData(builder);

        // REPLACE
        builder.replace(0, 5, "HAI");
        cetakData(builder);

        // CASTING MENJADI STRING
        String kalimat = builder.toString();
        System.out.println(kalimat);
        int addressString = System.identityHashCode(kalimat);
        System.out.println("ALAMAT = " + Integer.toHexString(addressString));
    }

    private static void cetakData(StringBuilder builder) {
        System.out.println("DATA = " + builder);
        System.out.println("PANJANG = " + builder.length());
        System.out.println("KAPASITAS = " + builder.capacity());

        int addressBuilder = System.identityHashCode(builder);
        System.out.println("ALAMAT = " + Integer.toHexString(addressBuilder));
    }

}