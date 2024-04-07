import java.util.LinkedList;
import java.util.Queue;;

public class BinaryTrees {
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

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    public static void preOrder(Node root) {
        if (root == null) {
            // System.out.print(-1 + " ");
            return;
        }
        System.out.print(root.data + "  ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root) {
        if (root == null) {
            // System.out.print(-1+" ");
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + "  ");
        inOrder(root.right);
    }

    public static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + "  ");
    }

    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + "  ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    public static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }
        return countNodes(root.left) + countNodes(root.right) + 1;
    }

    public static int sumNodes(Node root) {
        if (root == null) {
            return 0;
        }
        return sumNodes(root.left) + sumNodes(root.right) + root.data;
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int diameter1 = diameter(root.left);
        int diameter2 = diameter(root.right);
        int diameter3 = height(root.left) + height(root.right) + 1;
        return Math.max(diameter3, Math.max(diameter1, diameter2));
    }

    public static boolean isIdentical(Node root, Node subRoot){
        if (root == null && subRoot == null) {
            return true;
        }
        if (root == null || subRoot == null){
            return false;
        }
        if (root.data == subRoot.data) {
            return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
        }
        return false;
    }

    public static boolean isSubTree(Node root , Node subRoot){
        if (subRoot == null) {
            return true;
        }
        if (root == null) {
            return false;
        }

        if (root.data == subRoot.data) {
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }
        return isSubTree(root.left, subRoot.left) && isSubTree(root.right, subRoot.right);
    }
    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 10, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("Tree 1:");
        System.out.println(root.data);
        System.out.println("Preorder : ");
        preOrder(root);
        System.out.println("\nInorder : ");
        inOrder(root);
        System.out.println("\nPostorder : ");
        postOrder(root);
        System.out.println("Level order : ");
        levelOrder(root);
        System.out.println("Total nodes are : " + countNodes(root));
        System.out.println("Sum of all nodes : " + sumNodes(root));
        System.out.println("Height of tree is : " + height(root));
        System.out.println("Diameter of tree is : " + diameter(root));

        // int nodes2[] = { 6, 7, -1, -1, 8, -1, -1 };
        // BinaryTree tree2 = new BinaryTree();
        // Node root2 = tree2.buildTree(nodes2);
        // System.out.println("\n\nTree 2:");
        // System.out.println("Preorder : ");
        // preOrder(root2);
        // System.out.println("\nInorder : ");
        // inOrder(root2);
        // System.out.println("\nPostorder : ");
        // postOrder(root2);
        // System.out.println("Level order : ");
        // levelOrder(root2);
        // System.out.println("Total nodes are : " + countNodes(root2));
        // System.out.println("Sum of all nodes : " + sumNodes(root2));
        // System.out.println("Height of tree is : " + height(root2));
        // System.out.println("Diameter of tree is : " + diameter(root2));
    }
}
