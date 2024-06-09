import java.util.Scanner;

public class _4A {
    public static void main(String[] args) {
        _4A obj = new _4A();
        obj.solve();
    }

    void solve() {
        try (Scanner scanner = new Scanner(System.in)) {
            int watermelon = scanner.nextInt();
            if (watermelon <= 2) {
                System.out.println("NO");
                return;
            }
            System.out.println(watermelon % 2 == 0 ? "YES" : "NO");
        }
    }
}
