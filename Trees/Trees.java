package Trees;

import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Trees {
    static Scanner sc = new Scanner(System.in);

    public Node createTree() {
        Node root = null;
        System.out.print("Enter Data : ");
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        }
        root = new Node(data);
        System.out.println("Enter Left for " + data);
        root.left = createTree();
        System.out.println("Enter right for " + data);
        root.right = createTree();
        return root;
    }

    public void preOrder(Node root) {
        if (root == null) {
            return;
        } else {
            System.out.print(root.data + " - ");
        }
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(Node root) {
        if (root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data + " - ");
        inOrder(root.right);
    }

    public void postOrder(Node root) {
        if (root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " - ");
    }

    public static void main(String[] args) {
        Trees t = new Trees();
        Node root = t.createTree();
        System.out.println("Tree created ");
        System.out.println("PreOrder of treee is ");
        t.preOrder(root);
        System.out.println();
        System.out.println("Inorder of tree is : ");
        t.inOrder(root);
        System.out.println();
        System.out.println("Postorder of tree is : ");
        t.postOrder(root);
        System.out.println();
    }
}
