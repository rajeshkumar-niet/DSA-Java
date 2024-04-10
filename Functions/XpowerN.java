import java.util.Scanner;

public class XpowerN {
    public static int xpown(int n, int x) {
        if (n == 1) {
            return x;
        }
        if (n == 0) {
            return 1;
        }
        return x * xpown(n - 1, x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x : ");
        int x = sc.nextInt();
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.println(xpown(n, x));
        sc.close();
    }
}
