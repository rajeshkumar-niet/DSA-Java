import java.util.Scanner;

public class SolidRhombus {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i+j<=n-2) {
                    System.out.print("  ");
                }
                else{
                    for (int k = 0; k < n; k++) {
                        System.out.print("* ");
                    }
                    break;
                }
            }
            System.out.println();
        }
        sc.close();
    }
}