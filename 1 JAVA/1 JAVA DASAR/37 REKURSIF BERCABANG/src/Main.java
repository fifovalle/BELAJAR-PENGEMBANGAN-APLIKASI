import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner masukanPengguna = new Scanner(System.in);
        System.out.print("MASUKAN NILAI N = ");
        int nilai = masukanPengguna.nextInt();
        int nilaiFibonacci = fibonacci(nilai, "atas");
        System.out.println("NILAI FIBONACCI KE - " + nilai + " ADALAH " + nilaiFibonacci);
    }

    private static int fibonacci(int n, String daun) {
        System.out.println("DAUN " + daun);
        System.out.println("FIBONACCI KE - " + n);
        if (n == 1 || n == 0) {
            return n;
        } else {
            return fibonacci(n - 1, "kiri") + fibonacci(n - 2, "kanan");
        }
    }
}