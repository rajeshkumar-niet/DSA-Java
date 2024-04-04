import java.util.Scanner;

public class InvertedHalfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter l :");
        int l = sc.nextInt();
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                if (i+j >= l-1) {
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
