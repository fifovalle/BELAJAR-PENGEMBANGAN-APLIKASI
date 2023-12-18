import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner masukanPengguna;
        float a, b, hasil;
        String operator;

        masukanPengguna = new Scanner(System.in);
        System.out.print("MASUKAN ANGKA PERTAMA : ");
        a = masukanPengguna.nextFloat();
        System.out.print("MASUKAN OPERATOR : ");
        operator = masukanPengguna.next();
        System.out.print("MASUKAN ANGKA KEDUA : ");
        b = masukanPengguna.nextFloat();

        switch (operator) {
            case "+":
                hasil = a + b;
                System.out.println("JAWABAN : " + a + " " + operator + " " + b + " = " + hasil);
                break;
            case "-":
                hasil = a - b;
                System.out.println("JAWABAN : " + a + " " + operator + " " + b + " = " + hasil);
                break;
            case "*":
                hasil = a * b;
                System.out.println("JAWABAN : " + a + " " + operator + " " + b + " = " + hasil);
                break;
            case "/":
                if (b == 0) {
                    System.out.println("NILAI BILANGAN KEDUA TIDAK BOLEH NOL");
                } else {
                    hasil = a / b;
                    System.out.println("JAWABAN : " + a + " " + operator + " " + b + " = " + hasil);
                }
                break;
            default:
                System.out.println("OPERATOR TIDAK TERSEDIA");
                break;
        }
    }
}