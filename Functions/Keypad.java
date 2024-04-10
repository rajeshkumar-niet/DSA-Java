import java.util.Scanner;

public class Keypad {
    public static String[] keypad = {".", "abc", "def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printComb(String str, int idx, String comb ){
        if (idx == str.length()) {
            System.out.println(comb);
            return;
        }
        char curr = str.charAt(idx);
        String mapping = keypad[curr-'0'];
        for (int i = 0; i < mapping.length(); i++) {
            printComb(str, idx+1, comb+mapping.charAt(i) );
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter numbers : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printComb(str, 0, "");
        sc.close();
        
    }
}
