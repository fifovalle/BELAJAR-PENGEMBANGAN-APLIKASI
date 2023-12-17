import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // SWITCH CASE
        String masukan;
        Scanner masukanPengguna = new Scanner(System.in);
        System.out.print("PANGGIL NAMA : ");
        masukan = masukanPengguna.nextLine();

        switch (masukan) {
            case "udin":
                System.out.println("Saya Udin !");
                break;
            case "budi":
                System.out.println("Saya Budi !");
                break;
            default:
                System.out.println("Saya Tidak Tahu");
                break;
        }
        System.out.println("PROGRAM SELESAI");
    }
}