import java.util.Scanner;

public class B {
    static boolean res(int p, int[] a) {
        int origin = a[0] % p;
        for (int i = 2; i < a.length; ++i) {
            if (a[i] % p != origin) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] a = new int[m];
        for (int i = 0; i < a.length; ++i) {
            a[i] = sc.nextInt();
        }
        int space = a[1] - a[0];
        if (space < 0) space *= -1;
        for (int p = 2; p*p <= space; ++p) {
            if (res(p, a) == true) System.out.println(p);

        }
        sc.close();
    }
}
