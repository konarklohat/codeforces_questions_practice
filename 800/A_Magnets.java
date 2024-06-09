import java.util.*;
import java.io.*;

public class A_Magnets {
    public static void main(String[] args) {
        FastReader reader = new FastReader();
        int tt = 1;
        int lastPole = -1;
        int ans = 1;
        tt = reader.nextInt();

        while (tt-- > 0) {
            String s = reader.nextLine();
            int pole_1 = s.charAt(0);
            int pole_2 = s.charAt(1);

            if (lastPole != -1 && lastPole == pole_1) {
               ans++; 
            }

            lastPole = pole_2;
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