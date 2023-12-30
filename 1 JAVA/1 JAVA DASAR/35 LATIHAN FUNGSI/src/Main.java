import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner masukanPengguna = new Scanner(System.in);
        int masukanPanjang, masukanLebar;

        System.out.print("MASUKAN PANJANG = ");
        masukanPanjang = masukanPengguna.nextInt();
        System.out.print("MASUKAN LEBAR = ");
        masukanLebar = masukanPengguna.nextInt();
        gambar(masukanLebar, masukanPanjang);

        System.out.println("LUAS = " + luas(masukanLebar, masukanPanjang));
        System.out.println("KELILING = " + keliling(masukanLebar, masukanPanjang));
    }

    private static int keliling(int lebar, int panjang) {
        int keliling = (lebar + panjang) * 2;
        return keliling;
    }

    private static int luas(int lebar, int panjang) {
        int hasil = lebar * panjang;
        return hasil;
    }

    private static void gambar(int lebar, int panjang) {
        for (int i = 0; i < lebar; i++) {
            for (int j = 0; j < panjang; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}