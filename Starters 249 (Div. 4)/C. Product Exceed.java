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

    static void solve() throws Exception {
        int x = sc.nextInt();
        int y = sc.nextInt();
        int p = sc.nextInt();

        if (x * y >= p) {
            out.println(0);
            return;
        }

        int ans = Integer.MAX_VALUE;

        int a = 0;
        while (a <= 100) {
            int b = 0;
            while (b <= 100) {
                if ((x + a) * (y + b) >= p) {
                    ans = Math.min(ans, a + b);
                }
                b++;
            }
            a++;
        }

        out.println(ans);
    }

    public static void main(String[] args) throws Exception {
        int t = sc.nextInt();

        while (t-- > 0) {
            solve();
        }

        out.flush();
    }
}
