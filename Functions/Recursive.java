import java.util.Scanner;

public class Recursive {
    public static void pirntNum(int n ){
        if ( n== 0) {
            return;
        }
        System.out.println(n );
        pirntNum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n ");
        int n = sc.nextInt();
        pirntNum(n);
        sc.close();
    }
}
