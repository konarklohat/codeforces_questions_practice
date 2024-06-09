import java.util.*;
import java.io.*;

public class A_Wrong_Subtraction {
    public static void main(String[] args) {
        FastReader reader = new FastReader();
        int tt = 1;
        // tt = reader.nextInt();

        while (tt-- > 0) {
            int n = reader.nextInt();
            int k = reader.nextInt();
            int on = 0;

            while (k > 0) {
                if (n % 10 == 0) {
                    n /= 10;
                    k--;
                } else {
                    on = n;
                    n -= (k > (n % 10) ? (n % 10) : k);
                    k -= (k > (on % 10) ? (on % 10) : k);
                }
            }

            System.out.println(n);
        }
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