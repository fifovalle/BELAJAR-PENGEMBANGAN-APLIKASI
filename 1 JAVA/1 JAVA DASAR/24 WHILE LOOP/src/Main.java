public class Main {
    public static void main(String[] args) {
        int a = 0;
        boolean kondisi = true;

        System.out.println("AWALAN PROGRAM!");
        while (kondisi) {
            System.out.println("Perulangan ke-" + a);
            if (a == 10) {
                kondisi = false;
            }
            a++;
        }
        System.out.println("AKHIR PROGRAM!");
    }
}