import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        // Upper Half
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j<=i) {
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            for (int j = 0; j < n; j++) {
                if (j+i > n-2) {
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        // Lower Half
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j+i > n-1) {
                    System.out.print("  ");
                } else{
                    System.out.print("* ");
                }
            }
            for (int j = 0; j < n; j++) {
                if (j>=i) {
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }

        sc.close();
    }
}
