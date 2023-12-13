public class Main {
    public static void main(String[] args) {
        // OPERATOR LOGIKA
        // AND, OR, XOR, NEGASI
        boolean a, b, c;

        // OR
        System.out.println("OPERATOR OR");
        a = true;
        b = true;
        c = a || b;
        System.out.println(a + " OR " + b + " = " + c);
        a = false;
        b = false;
        c = a || b;
        System.out.println(a + " OR " + b + " = " + c);
        a = true;
        b = false;
        c = a || b;
        System.out.println(a + " OR " + b + " = " + c);
        a = false;
        b = true;
        c = a || b;
        System.out.println(a + " OR " + b + " = " + c);

        // AND
        System.out.println("OPERATOR AND");
        a = true;
        b = true;
        c = a && b;
        System.out.println(a + " AND " + b + " = " + c);
        a = false;
        b = false;
        c = a && b;
        System.out.println(a + " AND " + b + " = " + c);
        a = true;
        b = false;
        c = a && b;
        System.out.println(a + " AND " + b + " = " + c);
        a = false;
        b = true;
        c = a && b;
        System.out.println(a + " AND " + b + " = " + c);

        // XOR
        System.out.println("OPERATOR XOR");
        a = true;
        b = true;
        c = a ^ b;
        System.out.println(a + " XOR " + b + " = " + c);
        a = false;
        b = false;
        c = a ^ b;
        System.out.println(a + " XOR " + b + " = " + c);
        a = true;
        b = false;
        c = a ^ b;
        System.out.println(a + " XOR " + b + " = " + c);
        a = false;
        b = true;
        c = a ^ b;
        System.out.println(a + " XOR " + b + " = " + c);

        // NEGASI
        System.out.println("OPERATOR NEGASI");
        a = true;
        b = !a;
        System.out.println(!a);
        System.out.println(b);
    }
}