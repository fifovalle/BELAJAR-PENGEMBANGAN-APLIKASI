package components;

class Pemain {
    private String nama;
    private int nyawaAwal;
    private int seranganAwal;
    private int level;
    private int nyawaBertambah;
    private int seranganBertambah;
    private int totalSerangan;
    private boolean apakahMati;

    // OBJECT MEMBER
    private NyawaTambahan nyawaTambahan;
    private Senjata senjata;

    public Pemain(String nama) {
        this.nama = nama;
        this.nyawaAwal = 100;
        this.seranganAwal = 100;
        this.level = 1;
        this.nyawaBertambah = 20;
        this.seranganBertambah = 20;
        this.apakahMati = true;
    }

    public String getNama() {
        return this.nama;
    }

    public int getNyawa() {
        return this.nyawalMaksimal() - this.totalSerangan;
    }

    public void Tampil() {
        System.out.println("\nNama pemain\t: " + this.nama);
        System.out.println("Level\t\t: " + this.level);
        System.out.println("Nyawa Maksimal\t: " + this.getNyawa() + "/" + this.nyawalMaksimal());
        System.out.println("Serangan\t: " + this.getKekuatanSerangan());
        System.out.println("Status\t\t: " + (this.apakahMati ? "Hidup" : "Mati"));
        System.out.println('\n');
    }

    public void serangan(Pemain musuh) {
        // HITUNG SERANGAN
        int serangan = this.getKekuatanSerangan();

        System.out.println(
                "\nNama pemain\t: " + this.nama + " Menyerang " + musuh.getNama() + " Dengan Serangan " + serangan);

        musuh.bertahan(serangan);

        this.levelBertambah();
    }

    private int getKekuatanSerangan() {
        return this.seranganAwal + this.level * this.seranganBertambah + this.senjata.getSerangan();
    }

    public void bertahan(int serangan) {

        int kekuatanBertahan = serangan - this.nyawaTambahan.getKekuatanBertahan();
        int deltaSerangan;

        if (serangan > kekuatanBertahan) {
            deltaSerangan = serangan - kekuatanBertahan;
        } else {
            deltaSerangan = 0;
        }
        this.totalSerangan += deltaSerangan;

        if (this.getNyawa() <= 0) {
            this.apakahMati = false;
            this.totalSerangan = this.nyawalMaksimal();
        }
    }

    private void levelBertambah() {
        this.level++;
    }

    public void setNyawaTambahan(NyawaTambahan nyawaTambahan) {
        this.nyawaTambahan = nyawaTambahan;
    }

    public void setSenjata(Senjata senjata) {
        this.senjata = senjata;
    }

    public int nyawalMaksimal() {
        return this.nyawaAwal + this.level * this.nyawaBertambah + this.nyawaTambahan.getTambahNyawa();
    }

}

class Senjata {
    private String nama;
    private int serangan;

    public Senjata(String nama, int serangan) {
        this.nama = nama;
        this.serangan = serangan;
    }

    public int getSerangan() {
        return this.serangan;
    }
}

class NyawaTambahan {
    private String nama;
    private int kekuatan;
    private int tambahNyawa;

    public NyawaTambahan(String nama, int kekuatan, int tambahNyawa) {
        this.nama = nama;
        this.kekuatan = kekuatan;
        this.tambahNyawa = tambahNyawa;
    }

    public int getTambahNyawa() {
        return this.kekuatan * 10 + this.tambahNyawa;
    }

    public int getKekuatanBertahan() {
        return this.kekuatan * 2;
    }
}

public class Main {
    public static void main(String[] args) {

        Pemain pemain1 = new Pemain("Budi");
        NyawaTambahan nyawa1 = new NyawaTambahan("Jirah", 5, 100);
        Senjata senjata1 = new Senjata("Pisau", 10);
        pemain1.setSenjata(senjata1);
        pemain1.setNyawaTambahan(nyawa1);
        pemain1.Tampil();

        Pemain pemain2 = new Pemain("Otong");
        NyawaTambahan nyawa2 = new NyawaTambahan("Kaos", 2, 50);
        Senjata senjata2 = new Senjata("Bedog", 80);
        pemain2.setSenjata(senjata2);
        pemain2.setNyawaTambahan(nyawa2);

        pemain1.Tampil();
        pemain2.Tampil();

        pemain1.serangan(pemain2);
        pemain2.serangan(pemain1);
        pemain1.Tampil();
        pemain2.Tampil();
    }
}