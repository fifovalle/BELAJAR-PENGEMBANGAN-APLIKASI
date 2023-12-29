public class Main {
    public static void main(String[] args) {
        System.out.println("\n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.println("\n");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
                if (i == j) {
                    break;
                }
            }
            System.out.print("\n");
        }

        System.out.println("\n");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
                if ((i + j) == 4) {
                    break;
                }
            }
            System.out.print("\n");
        }
    }
}