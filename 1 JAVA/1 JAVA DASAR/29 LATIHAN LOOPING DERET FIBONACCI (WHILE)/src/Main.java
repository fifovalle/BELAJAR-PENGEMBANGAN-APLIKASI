import java.util.*;

public class Main {
    public static void main(String[] args) {

        int fn, fn1, fn2, n, i;
        Scanner masukanPengguna = new Scanner(System.in);
        System.out.print("MASUKAN NILAI FIBONACCI KE - : ");
        n = masukanPengguna.nextInt();

        fn2 = 0;
        fn1 = 1;
        fn = 1;

        i = 0;

        while (i < n) {
            System.out.println("NILAI KE - " + i + " = " + fn);
            fn = fn1 + fn2;
            fn2 = fn1;
            fn1 = fn;
            i++;
        }
    }
}
