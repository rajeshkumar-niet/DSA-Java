import java.util.Scanner;

public class TowerOfHanoi {
    public static void tower(int n, char S, char H, char D) {
        if (n == 1) {
            System.out.println("transfering " + n + " disk from " + S + " to " + D);
            return;
        }
        tower(n - 1, S, D, H);
        System.out.println("transfering " + n + " disk from " + S + " to " + D);
        tower(n - 1, H, S, D);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of disks ");
        int n = sc.nextInt();
        tower(n, 'S', 'H', 'D');
        sc.close();
    }
}
