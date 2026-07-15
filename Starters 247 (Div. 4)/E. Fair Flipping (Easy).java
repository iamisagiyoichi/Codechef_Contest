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

    static int cz(String a) {
        int b = 0;
        int c = 0;
        while (c < a.length()) {
            if (a.charAt(c) == '0') {
                b++;
            }
            c++;
        }
        return b;
    }

    static String i(String a) {
        char[] b = a.toCharArray();
        int c = 0;
        while (c < b.length) {
            b[c] = (b[c] == '0') ? '1' : '0';
            c++;
        }
        return new String(b);
    }

    static String s(int a, int b) {
        StringBuilder c = new StringBuilder();

        int d = 0;
        while (d < a) {
            c.append('0');
            d++;
        }

        d = 0;
        while (d < b) {
            c.append('1');
            d++;
        }

        return c.toString();
    }

    public static void solve() throws Exception {
        int a = sc.nextInt();
        int b = sc.nextInt();
        String c = sc.next();

        int d = cz(c);
        int e = a - d;

        if (d < b || e < b) {
            out.println(c);
            return;
        }

        if (d == b && e == b) {
            String f = i(c);
            if (c.compareTo(f) <= 0) {
                out.println(c);
            } else {
                out.println(f);
            }
            return;
        }

        out.println(s(d, e));
    }

    public static void main(String[] args) throws Exception {
        int t = sc.nextInt();

        while (t-- > 0) {
            solve();
        }

        out.flush();
    }
}
