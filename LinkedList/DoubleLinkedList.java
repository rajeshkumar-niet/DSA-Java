public class DoubleLinkedList {
    public Node head = null;
    private int size;
    public class Node {
        String data;
        Node next;
        Node prev;
        Node(String data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    // Adding at first
    public void addFirst(String data){
        Node newNode = new Node(data);
        // head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }

    // Print the list
    public void printList(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        do {
            System.out.print(currNode.data +" --> ");
            currNode = currNode.next;
        } while (currNode!=null);
        System.out.println("Null");
        System.out.println("The size of list is "+this.size);
    }
    public static void main(String[] args) {
        DoubleLinkedList DL = new DoubleLinkedList();
        DL.printList();
        DL.addFirst("Sonu");
        DL.addFirst("Hello");
        DL.printList();
    }
}
