import java.util.Scanner;
import java.util.ArrayList;

public class StackClassUsingAL {

    public static class Stack {
        ArrayList<Integer> list = new ArrayList<>();

        public void push(int data) {
            list.add(data);
        }

        public int pop() {
            if (list.isEmpty()) {
                System.out.println("Stack is empty ");
                return -1;
            }
            int result = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return result;
        }

        public int peek() {
            int result = list.get(list.size() - 1);
            return result;
        }

        public void printStack() {
            if (list.isEmpty()) {
                System.out.println("Stack is empty ");
                return ;
            }
            for (int i = list.size() - 1; i >= 0; i--) {
                System.out.println(list.get(i));
            }
        }

    }

    public static void main(String[] args) {
        Stack stack = new Stack();
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
                    int poped = stack.pop();
                    System.out.println(poped + " poped");
                    break;

                case 3:
                    int topdata = stack.peek();
                    System.out.println(topdata + " is at top of stack");
                    break;

                case 4:
                    stack.printStack();
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