import java.util.Scanner;

/**
 * First
 */
public class Holo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter l :");
        int l = sc.nextInt();
        System.out.print("Enter b :");
        int b = sc.nextInt();
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < l; j++) {
                if (j==0 || j==l-1 || i == 0 || i== b-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        sc.close();
    }
}