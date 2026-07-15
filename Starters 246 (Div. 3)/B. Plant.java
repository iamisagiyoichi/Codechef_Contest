import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    static void a(Scanner b, int[] c, int d)
    {
        int e = 0;
        while (e < d)
        {
            c[e] = b.nextInt();
            e++;
        }
    }

    static int b(int[] c, int d)
    {
        int e = 0;
        int f = 0;
        while (e < d - 1)
        {
            f = Math.max(f, Math.min(c[e], c[e + 1]));
            e++;
        }
        return f;
    }

    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        while (b-->0)
        {
            int c = a.nextInt();
            int[] d = new int[c];
            a(a, d, c);
            System.out.println(b(d, c));
        }
        a.close();
    }
}
