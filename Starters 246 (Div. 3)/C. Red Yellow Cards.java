import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    static int a(int b, int c)
    {
        return b + 1;
    }

    static int b(int c, int d)
    {
        if (d > c)
        {
            if (c % 2 == d % 2)
                return c;
            else
                return c - 1;
        }
        return c;
    }

    static int c(int d, int e)
    {
        if (e > d)
            return (e - d) / 2;
        return 0;
    }

    static int d(int e, int f)
    {
        int g = a(e, f);
        int h = b(g, f);
        int i = c(h, f);
        return e + i;
    }

    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        while (b-- > 0)
        {
            int c = a.nextInt();
            int d = a.nextInt();
            System.out.println(d(c, d));
        }
        a.close();
    }
}
