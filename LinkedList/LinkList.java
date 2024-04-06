public class LinkList {
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
    }

    // Delete the First node
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        this.size--;
        head = head.next;
    }

    // Delete the last node
    public void deleteLast() {
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

    // Delete nth element from last
    public void deletenthlast(int n) {
        System.out.println("Deleting nth element from last");
        if (head == null) {
            System.out.println("Empty list");
            return;
        }
        if (n > size) {
            System.out.println("Not possible n is greater then size");
            return;
        }
        int dfs = size - n + 1;
        int i = 0;
        Node currnNode = head;
        while (i <= dfs - 1) {
            currnNode = currnNode.next;
            i++;
        }
        currnNode.next = currnNode.next.next;
        System.out.println("Element deleted");
    }

    // Get the size of LinkedList
    public int getSize() {
        return this.size;
    }

    LinkList() {
        this.size = 0;
    }


    public static void main(String[] args) {
        LinkList LL = new LinkList();
        LL.addFirst("Welcome");
        // LL.addLast("Hello1");
        // LL.addLast("Hello2");
        // LL.addLast("Hello3");
        // LL.addLast("Hello42");
        // LL.addFirst("Sonu");
        LL.printList();
        LL.deletenthlast(1);
        System.out.println("delete nth from last");
        LL.printList();
        System.out.println("Calling getSize " + LL.getSize());
    }
}