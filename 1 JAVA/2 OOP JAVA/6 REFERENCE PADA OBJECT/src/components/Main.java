package components;

class Blog {
    String judul;
    String penulis;

    Blog(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    void tampilkan() {
        System.out.println("\nJudul : " + this.judul);
        System.out.println("\nPenulis : " + this.penulis);
    }
}

public class Main {
    public static void main(String[] args) {
        Blog dataBlog = new Blog("Java", "Andi");
        dataBlog.tampilkan();

        // MENAMPILKAN ADDRESS
        String dataAlamatBlog = Integer.toHexString(System.identityHashCode(dataBlog));
        System.out.println(dataAlamatBlog);

        // ASSIGNMENT OBJECT
        Blog dataBlog2 = dataBlog;
        dataBlog2.tampilkan();
        String dataAlamatBlog2 = Integer.toHexString(System.identityHashCode(dataBlog2));
        System.out.println(dataAlamatBlog2);

        dataBlog2.judul = "Python";
        dataBlog.tampilkan();
        dataBlog2.tampilkan();

        fungsi(dataBlog2);
        dataBlog.tampilkan();
        dataBlog2.tampilkan();
    }

    public static void fungsi(Blog dataBlog) {
        String dataAlamatBlog = Integer.toHexString(System.identityHashCode(dataBlog));
        System.out.println("Adreess Dalam Fungsi " + dataAlamatBlog);
        dataBlog.penulis = "Budi";
    }
}