import java.io.*;
import java.util.*;

public class Main {

    static class FastReader {
        private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        private StringTokenizer st;

        String next() throws IOException {
            while (st == null || !st.hasMoreElements()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        String nextLine() throws IOException {
            return br.readLine();
        }

        int[] nextIntArray(int n) throws IOException {
            int[] a = new int[n];
            int b = 0;
            while (b < n) {
                a[b] = nextInt();
                b++;
            }
            return a;
        }

        long[] nextLongArray(int n) throws IOException {
            long[] a = new long[n];
            int b = 0;
            while (b < n) {
                a[b] = nextLong();
                b++;
            }
            return a;
        }
    }

    static FastReader sc = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);

    static int fz(char[] a) {
        int b = 0;
        while (b < a.length) {
            if (a[b] == 'z') {
                return b;
            }
            b++;
        }
        return -1;
    }

    static void st(char[] a, int b) {
        while (b < a.length && a[b] == 'z') {
            a[b] = 'a';
            b++;
        }
    }

    public static void solve() throws Exception {
        int a = sc.nextInt();
        char[] b = sc.next().toCharArray();

        int c = fz(b);
        if (c != -1) {
            st(b, c);
        }

        out.println(new String(b));
    }

    public static void main(String[] args) throws Exception {
        int t = sc.nextInt();

        while (t-- > 0) {
            solve();
        }

        out.flush();
    }
}
