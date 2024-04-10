import java.util.Scanner;

public class Fibonaci {
    public static void printFibonaci(int n, int a  , int b){
        if (n==2) {
            return ;
        }
        System.out.println(a+b);
        printFibonaci(n-1, b, a+b);
    }
    public static void main(String[] args) {
         Scanner sc  = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.println(0);
        System.out.println(1);
        printFibonaci(n , 0,1);
        sc.close();
    }
}
