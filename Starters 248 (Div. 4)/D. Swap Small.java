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
    }

    static FastReader sc = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);

    static int cZ(int[] a) {
        int b = 0;
        int c = 0;

        while (c < a.length) {
            if (a[c] == 0) {
                b++;
            }
            c++;
        }

        return b;
    }

    static void pZ(int a) {
        int b = 0;

        while (b < a) {
            out.print("0 ");
            b++;
        }
    }

    static void pR(int[] a) {
        int b = 0;

        while (b < a.length) {
            if (a[b] != 0) {
                out.print(a[b] + " ");
            }
            b++;
        }
    }

    static void solve() throws Exception {
        int n = sc.nextInt();

        int[] a = new int[n];
        int b = 0;

        while (b < n) {
            a[b] = sc.nextInt();
            b++;
        }

        int c = cZ(a);

        pZ(c);
        pR(a);

        out.println();
    }

    public static void main(String[] args) throws Exception {
        int t = sc.nextInt();

        while (t-- > 0) {
            solve();
        }

        out.flush();
    }
}
