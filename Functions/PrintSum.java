import java.util.Scanner;

public class PrintSum {
    public static int findSum(int n ){
        if (n == 0) {
            return 0;
        }
        return n+findSum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        int sum =  findSum(n);
        System.out.println(sum);
        sc.close();
    }
}
