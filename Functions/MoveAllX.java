import java.util.Scanner;

public class MoveAllX {
    public static void move(String str , char c , int idx ,int countx, String newstr){
        if (idx == str.length()) {
            for (int i = 0; i <countx; i++) {
                newstr += c;
            }
            System.out.println(newstr);
            return;
        }

        if (str.charAt(idx)==c) {
            countx ++;
        }else{
            newstr += str.charAt(idx);
        }
        move(str, c, idx+1, countx, newstr);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.next();
        System.out.print("Enter char : ");
        char c = sc.next().charAt(0);
        move(str, c, 0, 0, "");
        sc.close();
    }
}
