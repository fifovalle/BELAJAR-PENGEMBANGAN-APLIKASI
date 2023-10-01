package components;

// INI MENGIMPORT CLASS CONSOLE 
import components.terminal.console;

// MENGIMPORT STATIC METHOD DARI CONSOLE
import static components.terminal.console.log;

class Main {
    public static void main(String[] args) {
        Pemain pemain1 = new Pemain("Joko");
        pemain1.Tampilkan();

        console.log("Console\t:" + pemain1.getNama());
        log("Log\t:" + pemain1.getNama());
    }
}

// INI TIDAK BISA
// private class Tes {

// }