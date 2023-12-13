public class Main {
    public static void main(String[] args) {
        // OPERATOR BITWISE, SHIFT LEFT, DAN SHIFT RIGHT

        byte a = 3;
        byte b;
        String a_bit, b_bit;

        a_bit = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.println("NILAI A_BIT = " + a_bit);
        System.out.println("NILAI A = " + a);

        // OPERATOR SHIFT LEFT
        System.out.println("OPERATOR SHIFT LEFT");
        b = (byte) (a << 2);
        b_bit = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.println(b);

        // OPERATOR SHIFT RIGHT
        System.out.println("OPERATOR SHIFT RIGHT");
        b = (byte) (a >> 1);
        b_bit = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.println(b);

        // OPERATOR BITWISE AND
        System.out.println("OPERATOR BITWISE AND");
        b = (byte) (a & 1);
        b_bit = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.println(b);

        // OPERATOR BITWISE OR
        System.out.println("OPERATOR BITWISE OR");
        b = (byte) (a | 4);
        b_bit = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.println(b);

        // OPERATOR BITWISE NOT
        System.out.println("OPERATOR BITWISE NOT");
        b = (byte) (~a);
        b_bit = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.println(b);
    }
}
