import java.util.Scanner;

/**
 * First
 */
public class First {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter l :");
        int l = sc.nextInt();
        System.out.print("Enter b :");
        int b = sc.nextInt();
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < l; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        sc.close();
    }
}