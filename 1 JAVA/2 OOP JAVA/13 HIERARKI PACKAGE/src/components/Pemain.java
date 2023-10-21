package components;

import components.terminal.console;

//  VISIBILITY DEFAULT
class Pemain {
    private String nama;

    Pemain(String nama) {
        this.nama = nama;
    }

    String getNama() {
        return this.nama;
    }

    void Tampilkan() {
        console.log("Nama\t:" + this.nama);
    }
}
