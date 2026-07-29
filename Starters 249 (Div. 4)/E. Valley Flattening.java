import java.io.*;
import java.util.*;

public class Main {

    static class FastReader {
        private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        private StringTokenizer st;

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) {
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
    }

    static FastReader sc = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);

    static long[] a(int b) throws Exception {
        long[] c = new long[b];
        int d = 0;
        while (d < b) {
            c[d] = sc.nextLong();
            d++;
        }
        return c;
    }

    static boolean[] b(long[] c) {
        int d = c.length;
        boolean[] e = new boolean[d];
        int f = 1;
        while (f < d - 1) {
            if (c[f] < c[f - 1] && c[f] < c[f + 1]) {
                e[f] = true;
            }
            f++;
        }
        return e;
    }

    static long c(long[] d, boolean[] e) {
        int f = d.length;
        long g = 0;
        int h = 0;
        while (h < f) {
            long i = d[h];

            if (h > 0 && e[h - 1]) {
                i = Math.min(i, d[h - 1]);
            }

            if (h < f - 1 && e[h + 1]) {
                i = Math.min(i, d[h + 1]);
            }

            g += i;
            h++;
        }
        return g;
    }

    static void solve() throws Exception {
        int a = sc.nextInt();
        long[] b = a(a);
        boolean[] c = b(b);
        out.println(c(b, c));
    }

    public static void main(String[] args) throws Exception {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
        out.flush();
    }
}
