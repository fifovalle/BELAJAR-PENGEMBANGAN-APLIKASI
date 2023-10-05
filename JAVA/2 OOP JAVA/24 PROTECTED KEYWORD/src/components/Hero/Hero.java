package components.Hero;

public abstract class Hero {
    protected String nama;
    private int level;

    public Hero(String nama) {
        this.nama = nama;
        this.level = 1;
    }

    public abstract void tampil();

    protected String getNama() {
        String str = "nama: " + this.nama + ", level: " + this.level;
        return str;
    }

    protected void setNama(String nama) {
        this.nama = nama;
    }
}
