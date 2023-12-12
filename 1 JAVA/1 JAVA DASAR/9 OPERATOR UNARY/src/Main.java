public class Main {
    public static void main(String[] args) {
        // UNARY = OPERASI YANG DILAKUKAN PADA SATU VARIABEL
        int angka = 1;
        System.out.println("UNARY MINUS = " + (-angka));
        System.out.println("UNARY PLUS = " + (+angka));

        // UNARY DECREMENT DAN INCREMENT
        int angka2 = 10;
        angka2++;
        System.out.println("INCREMENT = " + angka2);

        int angka3 = 10;
        angka3--;
        System.out.println("DECREMENT = " + angka3);

        // UNARY PREFIX DAN POSTFIX
        int angka4 = 10;
        int angka5 = 10;
        System.out.println("PREFIX = " + (++angka4));
        System.out.println("POSTFIX = " + (angka5++));

        // UNARY BOOLEAN DENGAN NEGASI
        boolean angka6 = true;
        System.out.println("NILAI BOOLEAN = " + (angka6));
        System.out.println("NILAI BOOLEAN = " + (!angka6));
    }
}