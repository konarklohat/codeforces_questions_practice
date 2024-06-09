import java.util.*;
import java.io.*;

public class A_Beautiful_Matrix {
    public static void main(String[] args) {
        FastReader reader = new FastReader();
        int tt = 1;
        // tt = reader.nextInt();

        while (tt-- > 0) {
            int x = 0, y = 0;
            int ops = 0;

            for (int i=0; i<5; i++) {
                for (int j=0; j<5; j++) {
                    if (reader.nextInt() == 1) {
                        x = i;
                        y = j;
                    }
                }
            }

            if (x >= 2) {
                ops += x - 2;
            } else {
                ops += 2 - x;
            }
            
            if (y >= 2) {
                ops += y - 2;
            } else {
                ops += 2 - y;
            }

            System.out.println(ops);
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