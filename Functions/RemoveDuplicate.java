import java.util.Scanner;

public class RemoveDuplicate {
    public static boolean[] map = new boolean[26];

    public static void remove(String str, int idx, String newstr) {
        if (idx == str.length()-1) {
            System.out.println("New String is " + newstr);
            return;
        }
        
        if (map[str.charAt(idx) - 'a']) {
            remove(str, idx + 1, newstr);
        } else {
            newstr += str.charAt(idx);
            map[str.charAt(idx)-'a'] = true;
            remove(str, idx + 1, newstr);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.next();
        remove(str, 0, "");
        sc.close();
    }
}
