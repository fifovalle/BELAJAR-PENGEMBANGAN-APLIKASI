public class Main {
    public static void main(String[] args) {
        // OPERATOR KOMPARASI AKAN MENGHASILKAN NILAI DALAM BENTUK BOOLEAN
        int a, b;
        boolean hasikKomparasi;

        // PERSAMAAN KOMPARASI
        System.out.println("PERSAMAAN KOMPARASI");
        a = 10;
        b = 10;
        hasikKomparasi = (a == b);
        System.out.println(a + " APAKAH SAMA DENGAN " + b + " ? " + hasikKomparasi);

        a = 12;
        b = 10;
        hasikKomparasi = (a == b);
        System.out.println(a + " APAKAH SAMA DENGAN " + b + " ? " + hasikKomparasi);

        // PERTIDAKSAMAAN KOMPARASI
        System.out.println("\nPERTIDAKSAMAAN KOMPARASI");
        a = 10;
        b = 10;
        hasikKomparasi = (a != b);
        System.out.println(a + " APAKAH TIDAK SAMA DENGAN " + b + " ? " + hasikKomparasi);

        a = 12;
        b = 10;
        hasikKomparasi = (a != b);
        System.out.println(a + " APAKAH TIDAK SAMA DENGAN " + b + " ? " + hasikKomparasi);

        // KURANG DARI KOMPARASI
        System.out.println("\nKURANG DARI KOMPARASI");
        a = 10;
        b = 10;
        hasikKomparasi = (a < b);
        System.out.println(a + " APAKAH KURANG DARI " + b + " ? " + hasikKomparasi);

        a = 12;
        b = 10;
        hasikKomparasi = (a < b);
        System.out.println(a + " APAKAH KURANG DARI " + b + " ? " + hasikKomparasi);

        // KURANG DARI SAMA DENGAN KOMPARASI
        System.out.println("\nKURANG DARI SAMA DENGAN KOMPARASI");
        a = 10;
        b = 10;
        hasikKomparasi = (a <= b);
        System.out.println(a + " APAKAH KURANG DARI SAMA DENGAN " + b + " ? " + hasikKomparasi);

        a = 12;
        b = 10;
        hasikKomparasi = (a <= b);
        System.out.println(a + " APAKAH KURANG DARI SAMA DENGAN " + b + " ? " + hasikKomparasi);

        // LEBIH DARI KOMPARASI
        System.out.println("\nLEBIH DARI KOMPARASI");
        a = 10;
        b = 10;
        hasikKomparasi = (a > b);
        System.out.println(a + " APAKAH LEBIH DARI " + b + " ? " + hasikKomparasi);

        a = 12;
        b = 10;
        hasikKomparasi = (a > b);
        System.out.println(a + " APAKAH LEBIH DARI " + b + " ? " + hasikKomparasi);

        // LEBIH DARI SAMA DENGAN KOMPARASI
        System.out.println("\nLEBIH DARI SAMA DENGAN KOMPARASI");
        a = 10;
        b = 10;
        hasikKomparasi = (a >= b);
        System.out.println(a + " APAKAH LEBIH DARI SAMA DENGAN " + b + " ? " + hasikKomparasi);

        a = 12;
        b = 10;
        hasikKomparasi = (a >= b);
        System.out.println(a + " APAKAH LEBIH DARI SAMA DENGAN " + b + " ? " + hasikKomparasi);
    }
}