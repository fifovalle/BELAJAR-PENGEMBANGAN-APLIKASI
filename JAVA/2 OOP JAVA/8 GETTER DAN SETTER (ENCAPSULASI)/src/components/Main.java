package components;

class Data {
    public int data1;
    private int data2;
    private double data3;

    public Data() {
        this.data1 = 0;
        this.data2 = 5;
    }

    // GETTER
    public int getData2() {
        return this.data2;
    }

    // SETTER
    public void setData3(double data3) {
        this.data3 = data3;
    }
}

class Lingkaran {
    private double Diameter;

    Lingkaran(double Diameter) {
        this.Diameter = Diameter;
    }

    // SETTER
    public void setJariJari(double jariJari) {
        this.Diameter = jariJari * 2;
    }

    // GETTER
    public double getJariJari() {
        return this.Diameter / 2;
    }

    public double getLuas() {
        return 3.14 * Diameter * Diameter / 4;
    }
}

public class Main {
    public static void main(String[] args) {

        Data objekData = new Data();

        // PUBLIC
        objekData.data1 = 10; // WRITE
        System.out.println("Public: " + objekData.data1); // READ

        int angka = objekData.getData2();
        System.out.println("Getter: " + angka); // READ

        objekData.setData3(10.0);

        Lingkaran objek2 = new Lingkaran(5);
        System.out.println("Jari-Jari: " + objek2.getJariJari());
        objek2.setJariJari(14);
        System.out.println("Jari-Jari: " + objek2.getJariJari());
        System.out.println("Luas: " + objek2.getLuas());
    }
}