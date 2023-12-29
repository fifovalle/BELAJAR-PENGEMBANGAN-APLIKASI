public class Main {
    public static void main(String[] args) {
        int y, x;
        x = 5;
        y = hitung(x);
        System.out.println("HASILNYA ADALAH : " + y);
    }

    static int hitung(int masukan) {
        int hasil;
        hasil = masukan * masukan;
        return hasil;
    }
}