import java.util.Scanner;

public class Floyd {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter l :");
        int l = sc.nextInt();
        int num = 1;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                if(j<=i){
                    System.out.print(num +" ");
                    num++;
                }
                
            }
            System.out.println("");
        }
        sc.close();
    }   
}
