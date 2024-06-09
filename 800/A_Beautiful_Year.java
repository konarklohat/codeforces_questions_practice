import java.util.*;
import java.io.*;

public class A_Beautiful_Year {
    public static void main(String[] args) {
        FastReader reader = new FastReader();
        int tt = 1;
        // tt = reader.nextInt();

        while (tt-- > 0) {
            int year = reader.nextInt();

            while (true) {
                year++;
                if (isBeautiful(year)) {
                    break;
                }
            }

            System.out.println(year);
        }
    }

    static Boolean isBeautiful(int year) {
        int a = year % 10;
        int b = (year / 10) % 10;
        int c = (year / 100) % 10;
        int d = (year / 1000) % 10;

        if (a != b && a != c && a != d && b != c && b != d && c != d) {
            return true;
        }

        return false;
    }

    // For fast input output
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            try {
                br = new BufferedReader(new FileReader("input.txt"));
                PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
                System.setOut(out);
            } catch (Exception e) {
                br = new BufferedReader(new InputStreamReader(System.in));
            }
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    // end of fast i/o code
}