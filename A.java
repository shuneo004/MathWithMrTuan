import java.util.Scanner;

public class A {
    static long power(long a, int b, int m) {
        long res = 1;
        while (b > 0) {
            if (b % 2 == 1) res *= a;
            res %= m;
            a *= a;
            a %= m;
            b /= 2;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int m = sc.nextInt();
        int res =(int)(power((long)(a), b, m) * ExtEuler.modInv(c, m) % m);
        System.out.println(res);
        sc.close();
    }
    
}
class ExtEuler {
    public static int d, x, y;
    public static void euler (int a, int m) {
        if (m == 0) {
            d = a;
            x = 1;
            y = 0;
        } else {
            euler(m, a % m);
            int tmp = x;
            x = y;
            y = tmp - (a / m) * y;
        }
    }
    public static int modInv(int a, int m) {
        euler(a, m);
        return (x % m + m) % m;
    }
}