import java.util.Scanner;

public class _71A {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int tt = scanner.nextInt();

            while (tt-- >= 0) {
                String str = scanner.nextLine();

                if (str.length() <= 10) {
                    System.out.println(str);
                } else {
                    System.out.println(str.charAt(0) + Integer.toString(str.length() - 2) + str.charAt(str.length() - 1));
                }
            }
        }

    }
}
