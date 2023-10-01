package components;

// INHERITANCE ADALAH HUBUNGAN IS_A

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        KekuatanHero hero2 = new KekuatanHero();
        hero1.nama = "Acak";
        hero2.nama = "Adul";
        hero1.Tampil();
        hero2.Tampil();
    }
}