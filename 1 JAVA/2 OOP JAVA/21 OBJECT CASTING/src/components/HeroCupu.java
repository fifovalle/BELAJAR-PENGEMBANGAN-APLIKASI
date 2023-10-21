package components;

public class HeroCupu extends Hero {
    public String type;

    public HeroCupu(String nama, double nyawa) {
        super(nama, nyawa);
        this.type = "Kuat";
    }

    public void tampil() {
        System.out.println(this.getNama() + "Adalah " + this.type + " hero");
    }
}
