import java.util.*;
import java.io.*;

public class B_Queue_at_the_School {
    public static void main(String[] args) {
        FastReader reader = new FastReader();
        int tt = 1;
        // tt = reader.nextInt();

        while (tt-- > 0) {
            int n = reader.nextInt();
            int t = reader.nextInt();
            String s = reader.nextLine();

            while (t-- > 0) {
                // s = s.replaceAll("BG", "GB");
                for (int i=0; i<n - 1; i++) {
                    if (s.charAt(i) == 'B' && s.charAt(i + 1) == 'G') {
                        s = s.substring(0, i) + "GB" + s.substring(i + 2);
                        i++;
                    }
                }
            }

            System.out.println(s);
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