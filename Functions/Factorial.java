import java.util.Scanner;

public class Factorial {
    public static int findFactorial(int n){
        if (n==1) {
            return 1;
        }
        return n*findFactorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        int sum = findFactorial(n);
        System.out.println(sum);
        sc.close();
    }
}
