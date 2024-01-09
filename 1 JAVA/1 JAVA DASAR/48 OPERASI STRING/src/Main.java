import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String kalimat = "SAYA SUKA MAKAN PISANG";

        // MENGAMBIL KOMPONEN DARI STRING
        System.out.println(kalimat.charAt(5));

        // SUBSTRING
        String kata = kalimat.substring(10, 15);
        System.out.println(kata);

        // CONCATENATION
        String kalimat2 = kata + " BALA BALA";
        System.err.println(kalimat2);

        kata = kata + " CIRENG";
        System.out.println(kata);

        // CONCAT DENGAN NON STRING
        int jumlah = 20;
        String kalimat3 = kata + " " + jumlah; // CASTING
        System.out.println(kalimat3);

        // LOWERCASE & UPPERCASE
        System.out.println(kalimat.toUpperCase());
        System.out.println(kalimat.toLowerCase());

        // REPLACE
        String kalimat4 = kalimat.replace("PISANG", "COMBRO");
        System.out.println(kalimat4);

        // COMPARE
        String motor1 = "HONDA";
        String motor2 = "HONDA KAWASAKI";
        System.out.println(motor1.compareTo(motor2));
        System.out.println(motor2.compareTo(motor1));

        String gorengan1 = "BAKWAN";
        String gorengan2 = "BALA BALA";
        System.out.println(gorengan1.compareTo(gorengan2));
        System.out.println(gorengan2.compareTo(gorengan1));

        // EQUALITY
        String kataInput = new String("TEST");
        String kataTest = "TEST";

        System.out.println("PERSAMAN PADA LOKASI STRING POOL");
        if (kataInput == kataTest) {
            System.out.println("SAMA");
        } else {
            System.out.println("TIDAK SAMA");
        }

        Scanner masukanPengguna = new Scanner(System.in);
        System.out.print("MENGAMBIL INPUT STRING DARI USER : ");
        kataInput = masukanPengguna.next();
        System.out.println("INI ADALAH MASUKAN DARI USER : " + kataInput);

        if (kataInput.equals(kataTest)) {
            System.out.println("SAMA");
        } else {
            System.out.println("TIDAK SAMA");
        }
    }
}