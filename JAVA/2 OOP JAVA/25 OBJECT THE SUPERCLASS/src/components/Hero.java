package components;

public class Hero extends Object {
    private String nama;

    public Hero(String nama) {
        this.nama = nama;
    }

    public void tampil() {
        System.out.println("Nama: " + this.nama);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            System.out.println("Sama");
            return true;
        } else if (this.getClass() == obj.getClass()) {
            System.err.println("Sama");
            return true;
        } else {
            return false;
        }
    }
}
