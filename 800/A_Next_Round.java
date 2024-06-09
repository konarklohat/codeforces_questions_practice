import java.util.*;
import java.io.*;

public class A_Next_Round {
    public static void main(String[] args) {
        FastReader reader = new FastReader();
        int tt = 1;
        // tt = reader.nextInt();

        while (tt-- > 0) {
            int n = reader.nextInt();
            int k = reader.nextInt();
            int left = 0, mid, right = n - 1;
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = reader.nextInt();
            }

            while (left <= right) {
                mid = (right + left) / 2;

                if (arr[mid] > arr[k - 1]) {
                    left = mid + 1;
                } else if (arr[mid] < arr[k - 1]) {
                    right = mid - 1;
                } else if (arr[mid] > 0) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            System.out.println(left);
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