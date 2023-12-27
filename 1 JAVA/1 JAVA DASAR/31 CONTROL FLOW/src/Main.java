public class Main {
    public static void main(String[] args) {
        // BREAK, CONTINUE, DAN RETURN
        int a = 0;
        while (true) {
            a++;
            if (a == 10) {
                break;
            } else if (a == 5) {
                continue;
            } else if (a == 7) {
                return;
            }
            System.out.println("LOOPING KE - " + a);
        }
        System.out.println("AKHIR LOOPING");
    }
}