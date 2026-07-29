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

    static long[] a(int n) throws Exception {
        long[] b = new long[n];
        int c = 0;
        while (c < n) {
            b[c] = sc.nextLong();
            c++;
        }
        return b;
    }

    static long[] b(long[] c) {
        int d = c.length;
        long e = Long.MIN_VALUE;
        long f = Long.MAX_VALUE;

        int g = 0;
        while (g < d / 2) {
            long h = c[g];
            long i = c[d - 1 - g];

            if (h != i) {
                long j = Math.min(h, i);
                long k = Math.max(h, i);

                if (k - j != 2) {
                    return new long[]{1};
                }

                e = Math.max(e, j);
                f = Math.min(f, k - 1);
            }
            g++;
        }

        return new long[]{0, e, f};
    }

    static void c(long[] d) {
        if (d[0] == 1) {
            out.println("No");
            return;
        }

        if (d[1] <= d[2]) {
            out.println("Yes");
        } else {
            out.println("No");
        }
    }

    static void solve() throws Exception {
        int a = sc.nextInt();
        long[] b = a(a);
        long[] c = b(b);
        c(c);
    }

    public static void main(String[] args) throws Exception {
        int t = sc.nextInt();

        while (t-- > 0) {
            solve();
        }

        out.flush();
    }
}
