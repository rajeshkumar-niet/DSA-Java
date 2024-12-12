import java.util.Scanner;
import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        boolean choice = true;
        while (choice) {
            System.out.println("1 : Push\n2 : Pop\n3 : Peek\n4 : Print  Stack\n5 : Quit");
            System.out.print("Enter operation number : ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter data : ");
                    int data = sc.nextInt();
                    stack.push(data);
                    break;

                case 2:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty! Cannot pop.");
                    } else {
                        int popped = stack.pop();
                        System.out.println(popped + " popped");
                    }
                    break;

                case 3:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty! No element to peek.");
                    } else {
                        int topData = stack.peek();
                        System.out.println(topData + " is at the top of the stack");
                    }
                    break;

                case 4:
                    System.out.println(stack);
                    break;

                case 5:
                    choice = false;
                    break;
                default:
                    break;
            }
        }
        sc.close();
    }
}
