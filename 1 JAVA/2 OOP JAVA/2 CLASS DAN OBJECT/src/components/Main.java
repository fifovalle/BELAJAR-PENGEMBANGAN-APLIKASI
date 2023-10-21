package components;

// MEMBUAT CLASS SEBAGAI TEMPLATE
class Pegawai {
    String nama;
    String gaji;
    int umur;
}

public class Main {
    public static void main(String[] args) {

        // MEMBUAT OBJECT
        Pegawai pegawai1 = new Pegawai();
        pegawai1.nama = "Budi";
        pegawai1.umur = 30;
        pegawai1.gaji = "Rp. 10.000.000";
        System.out.println(pegawai1.nama);
        System.out.println(pegawai1.umur);
        System.out.println(pegawai1.gaji);

        Pegawai pegawai2 = new Pegawai();
        pegawai2.nama = "Ucup";
        pegawai2.umur = 40;
        pegawai2.gaji = "Rp. 10.000";
        System.out.println(pegawai2.nama);
        System.out.println(pegawai2.umur);
        System.out.println(pegawai2.gaji);
    }
}
