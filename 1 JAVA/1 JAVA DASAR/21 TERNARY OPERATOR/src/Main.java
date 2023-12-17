import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int masukan, x;
        Scanner masukanPengguna = new Scanner(System.in);
        System.out.print("MASUKAN ANGKA : ");
        masukan = masukanPengguna.nextInt();

        x = (masukan == 10) ? (masukan * masukan) : (masukan + masukan);
        System.out.println("HASILNYA ADALAH : " + x);
    }
}