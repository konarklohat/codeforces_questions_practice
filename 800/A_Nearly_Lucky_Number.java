import java.util.*;
import java.io.*;

public class A_Nearly_Lucky_Number {
    public static void main(String[] args) {
        FastReader reader = new FastReader();
        int tt = 1;
        // tt = reader.nextInt();

        while (tt-- > 0) {
            String s = reader.nextLine();
            char[] c = s.toCharArray();
            int count = 0;
            String checker = "";

            for (int i=0; i<c.length; i++) {
                if (c[i] == '4' || c[i] == '7') {
                    count++;
                }
            }

            checker = Integer.toString(count);

            for (int i=0; i<checker.length(); i++) {
                if (checker.charAt(i) != '4' && checker.charAt(i) != '7') {
                    System.out.println("NO");
                    return;
                }
            }

            System.out.println("YES");
            return;
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