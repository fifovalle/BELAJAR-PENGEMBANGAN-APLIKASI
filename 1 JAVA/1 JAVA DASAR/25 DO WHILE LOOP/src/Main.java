public class Main {
    public static void main(String[] args) {
        int a = 0;
        boolean kondisi = true;

        System.out.println("AWALAN PROGRAM!");

        do {
            a++;
            System.out.println("BILANGAN KE " + a);
            if (a == 10) {
                kondisi = false;
            }
        } while (kondisi);
        System.out.println("AKHIR PROGRAM!");
    }
}