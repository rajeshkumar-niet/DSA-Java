import java.util.HashSet;
import java.util.Scanner;

public class Subsequences {
    public static void printSubsequence(String str, int idx, String newstr, HashSet<String> set ){
        if (idx == str.length()) {
            if (set.contains(newstr)) {
                return;
            }else{
                System.out.println(newstr);
                set.add(newstr);
                return;
            }
        }
        char curr = str.charAt(idx);
        printSubsequence(str, idx+1, newstr+curr, set);
        printSubsequence(str, idx+1, newstr, set);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        System.out.print("Enter String : ");
        String str = sc.next();
        printSubsequence(str, 0, "", set);
        sc.close();
    }
}
