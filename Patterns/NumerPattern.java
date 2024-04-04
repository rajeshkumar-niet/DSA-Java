import java.util.Scanner;

public class NumerPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter l :");
        int l = sc.nextInt();
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                if(j<=i){
                    System.out.print(j+1 +" ");
                }
            }
            System.out.println("");
        }
        sc.close();
    }
}
