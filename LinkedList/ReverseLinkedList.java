import java.util.Scanner;

public class ReverseLinkedList {
    public Node head = null;
    private int size;

    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Insert in starting
    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        this.size++;
        System.out.println("Element " + data + " added to first");
    }

    // Insert at last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode; // This line was previously outside the loop
        this.size++;
        System.out.println("Element " + data + " added to last");
    }

    // Delete the First node
    public void deleteFirst() {
        System.out.println("Deleting First element");
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        this.size--;
        head = head.next;
        System.out.println("First element deleted");
    }

    // Delete the last node
    public void deleteLast() {
        System.out.println("Deleting last element");
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        this.size--;
        if (head.next == null) {
            head = null;
        }
        Node currNode = head;
        while (currNode.next.next != null) {
            currNode = currNode.next;
        }
        currNode.next = null;
        System.out.println("Last element deleted");
    }

    // Delete nth element from last
    public void deletenthlast(int n) {
        System.out.println("Deleting nth element from last");
        if (head == null) {
            System.out.println("Empty list");
            return;
        }
        if (n > size) {
            System.out.println("Not possible n is greater than size");
            return;
        }
        int dfs = size - n; // Correct the calculation of dfs
        int i = 0;
        Node currNode = head;
        while (i < dfs - 2) { // Iterate till the node before the node to be deleted
            currNode = currNode.next;
            i++;
        }

        // Update the reference of the previous node to skip the node to be deleted
        currNode.next = currNode.next.next;
        System.out.println("Element deleted");
    }

    // Reverse a link list
    public void reverseList() {
        if (head == null || head.next == null) {
            System.out.println("List is empty or list have only one element");
            return;
        }
        Node preNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = preNode;
            // update
            preNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = preNode;
        System.out.println("List reversed");
    }

    // Print the List
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        do {
            System.out.print(currNode.data + " --> ");
            currNode = currNode.next;
        } while (currNode != null);
        System.out.println("Null");
        System.out.println("The size of list is " + this.size);
    }

    // Get the size of LinkedList
    public int getSize() {
        return this.size;
    }

    ReverseLinkedList() {
        this.size = 0;
    }

    public static void main(String[] args) {
        ReverseLinkedList LL = new ReverseLinkedList();
        int ch = 1;
        System.out.println("Welcome Sir ");
        Scanner sc = new Scanner(System.in);
        while (ch != 4) {
            System.out.println("Enter your choice ");
            System.out.print("1. Add element \n2. Delete element \n3. Print List \n4. Exit : ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    int temp;
                    System.out.print("1. Enter in starting \n2. Enter at Last : ");
                    temp = sc.nextInt();
                    if (temp == 1) {
                        System.out.print("Enter element : ");
                        String data = sc.next();
                        LL.addFirst(data);
                    } else if (temp == 2) {
                        System.out.print("Enter element : ");
                        String data = sc.next();
                        LL.addLast(data);
                    } else {
                        System.out.println("invalid input");
                    }
                    break;
                case 2:
                    System.out.print("1. Delete First \n2. Delete Last \n3. Delete nth from last : ");
                    temp = sc.nextInt();
                    if (temp == 1) {
                        LL.deleteFirst();
                    } else if (temp == 2) {
                        LL.deleteLast();
                    } else if (temp == 3) {
                        System.out.print("Enter N from last : ");
                        int n = sc.nextInt();
                        LL.deletenthlast(n);
                    } else {
                        System.out.println("Invalid input");
                    }
                    break;
                case 3:
                    LL.printList();
                    break;
                case 4:
                    System.out.println("Thankyou for using LinkedList");
                    break;
                default:
                    System.out.println("Enter Valid choice");
                    break;
            }
            System.out.println();
        }
        sc.close();
    }
}