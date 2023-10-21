package components;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.nama = "Adul";
        hero1.tampil();

        KekuatanHero hero2 = new KekuatanHero();
        hero2.nama = "Komeng";
        hero2.kekuatanBertahan = 100;
        hero2.tampil();
    }
}