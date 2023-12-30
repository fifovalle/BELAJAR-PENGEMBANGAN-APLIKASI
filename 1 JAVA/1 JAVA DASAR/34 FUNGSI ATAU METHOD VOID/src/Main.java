public class Main {
    public static void main(String[] args) {
        System.out.println(simpel());
        fungsiVoid("Fungsi Void");
        selamatSiang("Naufal");
        selamatPagi("Naufal");
    }

    private static void selamatPagi(String nama) {
        System.out.println("Selamat Pagi " + nama);
    }

    private static void selamatSiang(String nama) {
        System.out.println("Selamat Siang " + nama);
    }

    private static void fungsiVoid(String masukan) {
        System.out.println("Fungsi Void " + masukan);
    }

    private static float simpel() {
        return 10.0f;
    }
}