import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner masukanPengguna;
        float a, b, hasil;
        char operator;
        masukanPengguna = new Scanner(System.in);

        System.out.print("MASUKKAN NILAI PERTAMA : ");
        a = masukanPengguna.nextFloat();
        System.out.print("MASUKAN OPERATOR : ");
        operator = masukanPengguna.next().charAt(0);
        System.out.print("MASUKKAN NILAI KEDUA : ");
        b = masukanPengguna.nextFloat();

        if (operator == '+') {
            hasil = a + b;
            System.out.println("HASILNYA ADALAH : " + (hasil));
        } else if (operator == '-') {
            hasil = a - b;
            System.out.println("HASILNYA ADALAH : " + (hasil));
        } else if (operator == '*') {
            hasil = a * b;
            System.out.println("HASILNYA ADALAH : " + (hasil));
        } else if (operator == '/') {
            if (b == 0) {
                System.out.println("NILAI KEDUA TIDAK BISA 0");
            } else {
                hasil = a / b;
                System.out.println("HASILNYA ADALAH : " + (hasil));
            }
        } else {
            System.out.println("OPERATOR TIDAK TERSEDIA");
        }
    }
}