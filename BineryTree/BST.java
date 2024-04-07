public class BST {
    // Node Class
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // insert method
    public static Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (root.data > data) {
            // left sub tree
            root.left = insert(root.left, data);
        } else {
            // right sub tree
            root.right = insert(root.right, data);
        }
        return root;
    }

    // Inorder travering
    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + "  ");
        inOrder(root.right);
    }

    // Search a node
    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (root.data > key) {
            // left subtree
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    // inOrderSuccessor
    public static Node inOrderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // Delete a node
    public static Node delete(Node root, int key) {
        if (key < root.data) {
            // left subtree
            root.left = delete(root.left, key);
        } else if (root.data < key) {
            // right subtree
            root.right = delete(root.right, key);
        } else {
            // root.data == key
            // Case ! no child of node
            if (root.left == null && root.right == null) {
                return null;
            }
            // case 2 only one child of node
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // case 3 two childs
            Node IS = inOrderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static void main(String[] args) {
        int values[] = { 5, 1, 3, 4, 2, 11 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inOrder(root);
        System.out.println();
        delete(root, 1);
        inOrder(root);
    }

}
