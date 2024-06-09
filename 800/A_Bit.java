import java.util.*;
import java.io.*;

public class A_Bit {
    public static void main(String[] args) {
        FastReader reader = new FastReader();
        int tt = 1;
        int num = 0;
        tt = reader.nextInt();

        while (tt-- > 0) {
            String s = reader.nextLine();

            if (s.charAt(0) == '+') 
                ++num;
            else if (s.charAt(s.length() - 1) == '+')
                num++;
            else if (s.charAt(0) == '-')
                --num;
            else 
                num--;
        }

        System.out.println(num);
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