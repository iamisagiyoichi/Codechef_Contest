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
    }

    static FastReader sc = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);

    public static void solve() throws Exception {
        int a = 0;
        int b = 0;
        int c = 0;

        while (c < 5) {
            int d = sc.nextInt();

            if (d >= 60) {
                a++;
            }

            if (d >= 30) {
                b++;
            }

            c++;
        }

        if (a >= 2 && b >= 4) {
            out.println("Pass");
        } else {
            out.println("Fail");
        }
    }

    public static void main(String[] args) throws Exception {
        int t = sc.nextInt();

        while (t-- > 0) {
            solve();
        }

        out.flush();
    }
}
