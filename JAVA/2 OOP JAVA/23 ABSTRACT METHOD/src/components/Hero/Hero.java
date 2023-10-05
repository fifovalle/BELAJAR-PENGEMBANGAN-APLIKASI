package components.Hero;

// ABSTRACT CLASS
public abstract class Hero {
    private String nama;
    private int level;

    public Hero(String nama) {
        this.nama = nama;
        this.level = 1;
    }

    public void tampil() {
        System.out.println("Hero : " + this.nama);
        System.out.println("Level : " + this.level);
    }

    // ABSTRACT METHOD
    public abstract void levelUp();

    public void setLevel(int level) {
        this.level += level;
    }
}
