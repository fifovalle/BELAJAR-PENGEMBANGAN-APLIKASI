package components;

class Pemain {
    private String nama;
    private int nyawaAwal;
    private int seranganAwal;
    private NyawaTambahan nyawaTambahan;
    private Senjata senjata;
    private int level;
    private int nyawaBertambah;
    private int seranganBertambah;

    public Pemain(String nama) {
        this.nama = nama;
        this.nyawaAwal = 100;
        this.seranganAwal = 100;
        this.level = 1;
        this.nyawaBertambah = 20;
        this.seranganBertambah = 20;
    }

    public void Tampil() {
        System.out.println("\nNama pemain\t: " + this.nama);
        System.out.println("Level\t\t: " + this.level);
        System.out.println("Nyawa Maksimal\t: " + this.nyawalMaksimal());
        System.err.println("Serangan\t: " + this.getKekuatanSerangan());
        System.out.println('\n');
    }

    public void levelBertambah() {
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

    public int getKekuatanSerangan() {
        return this.seranganAwal + this.level * this.seranganBertambah + this.senjata.getSerangan();
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
}

public class Main {
    public static void main(String[] args) {

        Pemain pemain1 = new Pemain("Budi");
        NyawaTambahan nyawa1 = new NyawaTambahan("Jirah", 5, 100);
        Senjata senjata1 = new Senjata("Pisau", 10);
        pemain1.setSenjata(senjata1);
        pemain1.setNyawaTambahan(nyawa1);
        pemain1.Tampil();
        pemain1.levelBertambah();

        Pemain pemain2 = new Pemain("Otong");
        NyawaTambahan nyawa2 = new NyawaTambahan("Kaos", 2, 50);
        Senjata senjata2 = new Senjata("Bedog", 80);
        pemain2.setSenjata(senjata2);
        pemain2.setNyawaTambahan(nyawa2);
        pemain2.levelBertambah();

        pemain1.Tampil();
        pemain2.Tampil();
    }
}