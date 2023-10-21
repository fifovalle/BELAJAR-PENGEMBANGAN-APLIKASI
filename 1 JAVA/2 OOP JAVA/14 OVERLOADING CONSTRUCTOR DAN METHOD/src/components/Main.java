package components;

public class Main {
    public static void main(String[] args) {
        // OVERLOADING PADA CONSTRUCTOR
        Pemain pemain1 = new Pemain("Naufal");
        Pemain pemain2 = new Pemain();
        Pemain pemain3 = new Pemain();
        Pemain pemain4 = new Pemain("Adul");

        pemain1.Tampilkan();
        pemain2.Tampilkan();
        pemain3.Tampilkan();
        pemain4.Tampilkan();

        // OVERLOADING PADA METHOD
        int a = Mat.tambah(1, 19);
        System.out.println(a);
        double b = Mat.tambah(1, 0.56);
        System.out.println(b);
    }
}
