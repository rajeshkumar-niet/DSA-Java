import java.util.Queue;
import java.util.LinkedList;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {
    static int idx = -1;

    public Node preOrderInsert(int[] nodes) {
        idx++;
        if (nodes[idx] == -1) {
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left = preOrderInsert(nodes);
        newNode.right = preOrderInsert(nodes);
        return newNode;
    }

    public Node inOrderInsert(int[] nodes) {
        idx++;
        if (nodes[idx] == -1) {
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left = inOrderInsert(nodes);
        newNode.right = inOrderInsert(nodes);
        return newNode;
    }

    // Function to print tree nodes in pre order. Null Nodes will be printed as -1
    public void preOrderPrint1(Node root) {
        if (root == null) {
            System.out.print(-1 + " ");
            return;
        }
        System.out.print(root.data + " ");
        preOrderPrint1(root.left);
        preOrderPrint1(root.right);
    }

    // Function to print tree nodes in pre order. Null Nodes will not printed
    public void preOrderPrint(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrderPrint(root.left);
        preOrderPrint(root.right);
    }

    // Function to print tree nodes in on order. Null Nodes will be printed as -1
    public void inOrderPrint1(Node root) {
        if (root == null) {
            System.out.print(-1 + " ");
            return;
        }
        inOrderPrint1(root.left);
        System.out.print(root.data + " ");
        inOrderPrint1(root.right);
    }

    // Function to print tree nodes in in order. Null Nodes will not printed
    public void inOrderPrint(Node root) {

        if (root == null) {
            return;
        }
        inOrderPrint(root.left);
        System.out.print(root.data + " ");
        inOrderPrint(root.right);
    }

    // Function to print tree nodes in post order. Null Nodes will be printed as -1
    public void postOrderPrint1(Node root) {
        if (root == null) {
            System.out.print(-1 + " ");
            return;
        }
        postOrderPrint1(root.left);
        postOrderPrint1(root.right);
        System.out.print(root.data + " ");
    }

    // Function to print tree nodes in post order. Null Nodes will not printed
    public void postOrderPrint(Node root) {
        if (root == null) {
            return;
        }
        postOrderPrint(root.left);
        postOrderPrint(root.right);
        System.out.print(root.data + " ");
    }

    public void levelOrderPrint(Node root) {
        if (root == null)
            return;
        Queue<Node> q = new LinkedList();
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

    public int countNodes(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    public int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        return root.data + sumOfNodes(root.left) + sumOfNodes(root.right);
    }

    public int height(Node root) {
        if (root == null) {
            return 0;
        }

        return Math.max(height(root.left), height(root.right)) + 1;
    }

    public int diameter(Node root) {
        if (root == null) {
            return 0;
        }

        int leftdia = diameter(root.left);
        int rightDIa = diameter(root.right);
        int rootdia = height(root.left) + height(root.right) + 1;
        int maxm = Math.max(Math.max(leftdia, rightDIa), rootdia);

        return maxm;
    }

    public class TreeInfo {
        int ht, dia;

        TreeInfo(int ht, int dia) {
            this.ht = ht;
            this.dia = dia;
        }
    }

    public TreeInfo diameterOpt(Node root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }

        TreeInfo left = diameterOpt(root.left);
        TreeInfo right = diameterOpt(root.right);

        int rootheight = Math.max(left.ht, right.ht) + 1;

        int d1 = left.dia;
        int d2 = right.dia;
        int d3 = left.ht + right.dia + 1;

        int mydiameter = Math.max(d1, Math.max(d2, d3));

        TreeInfo myInfo = new TreeInfo(rootheight, mydiameter);
        return myInfo;
    }

    public boolean isEqualTree(Node root1, Node root2) {
        if (root1 == null || root2 == null) {
            return true;
        }
        if (root1.data == root2.data) {
            boolean l = isEqualTree(root1.left, root2.left);
            boolean r = isEqualTree(root1.right, root2.right);
            return l && r;
        }
        return false;
    }

    public boolean isSubtree(Node root, Node sub) {
        if (sub == null) {
            return true;
        }

        if (root == null) {
            return false;
        }

        if (root.data == sub.data) {
            if (isEqualTree(root, sub)) {
                return true;
            }
        } else {
            isSubtree(root.left, sub);
            isSubtree(root.right, sub);
        }

        return true;
    }
}

public class BinaryTreeJava {

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.preOrderInsert(nodes);

        System.out.println(root.data);
        System.out.println("Pre order traversal without null node");
        tree.preOrderPrint(root);
        System.out.println();
        System.out.println("Pre order traversal with null node");
        tree.preOrderPrint1(root);
        System.out.println();

        System.out.println("IN order traversal without null node");
        tree.inOrderPrint(root);
        System.out.println();
        System.out.println("IN order traversal with null node");
        tree.inOrderPrint1(root);
        System.out.println();

        System.out.println("Level order traversal : ");
        tree.levelOrderPrint(root);

        int totalnodes = tree.countNodes(root);
        System.out.println("Total number of nodes : " + totalnodes);

        int sumNodes = tree.sumOfNodes(root);
        System.out.println("Total sum of nodes : " + sumNodes);

        int height = tree.height(root);
        System.out.println("Height of tree is " + height);

        int diameter = tree.diameter(root);
        System.out.println("Diameter of tree is : " + diameter);

        int diameteropt = tree.diameterOpt(root).dia;
        System.out.println("Diameter of tree is : " + diameteropt);
    }
}
