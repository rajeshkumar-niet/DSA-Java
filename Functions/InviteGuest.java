import java.util.Scanner;

public class InviteGuest {
    public static int invite(int n) {
        if (n == 1) {
            return 1;
        }
        if (n==2) {
            return 2;
        }
        return invite(n-1) + invite(n-2)*(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of guests : ");
        int n = sc.nextInt();
        int total = invite(n);
        System.out.println(total);
        sc.close();
    }
}
