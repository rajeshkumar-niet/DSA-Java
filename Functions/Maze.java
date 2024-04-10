import java.util.Scanner;

public class Maze {
    public static int countPath(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 || j == m - 1) {
            return 1;
        }

        // Count Downword
        int down = countPath(i + 1, j, n, m);
        // count right
        int right = countPath(i, j + 1, n, m);
        return down + right;
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the dimension of maze nXm ");
        System.out.print("n : ");
        int n = sc.nextInt();
        System.out.print("m : ");
        int m = sc.nextInt();
        int totalpath = countPath(0, 0, n, m);
        System.out.println(totalpath);
        sc.close();
    }
}
