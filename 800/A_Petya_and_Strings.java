import java.util.*;
import java.io.*;

public class A_Petya_and_Strings {
    public static void main(String[] args) {
        FastReader reader = new FastReader();
        int tt = 1;
        // tt = reader.nextInt();

        while (tt-- > 0) {
            String a = reader.nextLine();
            String b = reader.nextLine();
            Boolean flag = false;

            for (int i=0; i<a.length(); i++) {
                if (Character.toLowerCase(a.charAt(i)) < Character.toLowerCase(b.charAt(i))) {
                    System.out.println("-1");
                    flag = true;
                    break;
                }

                if (Character.toLowerCase(a.charAt(i)) > Character.toLowerCase(b.charAt(i))) {
                    System.out.println("1");
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                System.out.println("0");
            }
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