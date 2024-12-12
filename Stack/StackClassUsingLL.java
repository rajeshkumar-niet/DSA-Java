import java.util.Scanner;

public class StackClassUsingLL {
// StackClassUsingAL
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static class Stack {
        Node top;

        public void push(int data) {
            Node temp = new Node(data);
            temp.next = top;
            top = temp;

        }

        public int pop() {
            if (top == null) {
                System.out.println("Empty stack");
                return -1;
            }
            int result = top.data;
            top = top.next;
            return result;
        }

        public int peek() {
            if (top == null) {
                System.out.println("Stack is empty ");
                return -1;
            }

            return top.data;
        }

        public void printStack() {
            if (top == null) {
                System.out.println("Stack is empty");
                return;
            }
            Node t = top;
            while (t != null) {
                System.out.println(t.data);
                t = t.next;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Stack stack = new Stack(); // No need for an instance of StackClass
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