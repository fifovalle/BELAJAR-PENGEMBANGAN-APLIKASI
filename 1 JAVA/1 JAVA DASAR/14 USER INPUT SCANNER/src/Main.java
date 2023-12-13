import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // MENGHITUNG LUAS PERSEGI PANJANG
        Scanner masukanPengguna = new Scanner(System.in);
        int panjang, lebar, luas;
        System.out.print("MASUKAN PANJANGNYA = ");
        panjang = masukanPengguna.nextInt();
        System.out.print("MASUKAN LEBARNYA = ");
        lebar = masukanPengguna.nextInt();

        luas = panjang * lebar;
        System.out.print("LUASNYA = " + luas);
    }
}