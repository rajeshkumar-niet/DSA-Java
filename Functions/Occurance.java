import java.util.Scanner;

public class Occurance {
    public static int first = -1;
    public static int last = -1;
    public static void occur(String str , char c, int idx){
        if (idx== str.length()) {
            if (first==-1) {
                System.out.println("Character is not found in string");
            }else{
                System.out.println("First occuracnce at "+ (first+1)+" and last occurance at "+ (last+1));
            }
            return;
        }
        if (str.charAt(idx)==c) {
            if (first == -1) {
                first = idx;    
            }else{
                last = idx;
            }
        }
        occur(str, c, idx+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.next();
        System.out.print("Enter char : ");
        char c = sc.next().charAt(0);
        occur(str, c, 0);
        sc.close();
    }
}
