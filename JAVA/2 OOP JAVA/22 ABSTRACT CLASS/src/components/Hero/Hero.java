package components.Hero;

// ABSTRACT CLASS
public abstract class Hero {
    private String nama;

    public Hero(String nama) {
        this.nama = nama;
    }

    public void tampil() {
        System.out.println("Hero : " + this.nama);
    }
}
