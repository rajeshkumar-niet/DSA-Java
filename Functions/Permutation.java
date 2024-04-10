import java.util.Scanner;

public class Permutation {
    public static void printPermutation(String str, int idx, String permu){
        if (idx == str.length()) {
            System.out.println(permu);
            return;
        }
        
        for (int i = 0; i < str.length(); i++) {
            printPermutation(str, idx+1, permu+str.charAt(i));
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.next();
        printPermutation(str, 0, "");
        sc.close();
    }
}
