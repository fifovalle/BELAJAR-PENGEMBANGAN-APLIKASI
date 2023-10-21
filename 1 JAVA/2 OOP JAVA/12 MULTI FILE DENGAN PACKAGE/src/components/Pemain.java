package components;

class Pemain {
    private String nama;

    Pemain(String nama) {
        this.nama = nama;
    }

    void setNama(String nama) {
        this.nama = nama;
    }

    void Tampilkan() {
        System.out.println("Nama Pemain\t: " + this.nama);
    }
}
