import java.util.*;
import java.io.*;

public class A_Tram {
    public static void main(String[] args) {
        FastReader reader = new FastReader();
        int tt = 1;
        int ans = Integer.MIN_VALUE;
        int totalPassengers = 0;
        tt = reader.nextInt();

        while (tt-- > 0) {
            int exit = reader.nextInt();
            int enter = reader.nextInt();
            totalPassengers += enter - exit;
            ans = Math.max(ans, totalPassengers);
        }

        System.out.println(ans);
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