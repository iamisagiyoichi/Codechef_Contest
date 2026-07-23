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
        int a = sc.nextInt();

        if (9 - a >= 1 && 9 - a <= 6) {
            out.println("Yes");
        } else {
            out.println("No");
        }
    }

    public static void main(String[] args) throws Exception {
        solve();
        out.flush();
    }
}
