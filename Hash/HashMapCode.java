import java.util.*;

class HashMap<K, V> {
    private class Node {
        K key;
        V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private int n; // number of nodes
    private int N; // number of buckets
    private LinkedList<Node> bucket[];

    @SuppressWarnings("unchecked")
    public HashMap() {
        this.N = 4;
        this.bucket = new LinkedList[4];
        for (int i = 0; i < 4; i++) {
            this.bucket[i] = new LinkedList<>();
        }
    }

    private int hashFunction(K key) {
        // Fuction to get hash index for a key
        int bucketIndex = key.hashCode();
        return Math.abs(bucketIndex) % N;
    }

    private int searchinLL(K key, int bucketIndex) {
        // Fuction to find position of a key in particular bucket 
        LinkedList<Node> ll = bucket[bucketIndex];
        for (int i = 0; i < ll.size(); i++) {
            if (key == ll.get(i).key) {
                return i;
            }
        }
        return -1;
    }

    @SuppressWarnings("unchecked")
    private void rehash() {
        // Fuction to increase bucket size/Arraylist size
        LinkedList<Node> oldbucket[] = bucket;
        bucket = new LinkedList[N * 2];
        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new LinkedList<>();
        }

        for (int i = 0; i < oldbucket.length; i++) {
            LinkedList<Node> ll = oldbucket[i];
            for (int j = 0; j < ll.size(); j++) {
                Node node = ll.get(j);
                put(node.key, node.value);
            }
        }
    }

    public void put(K key, V value) {
        // Fuction to add key value 
        int bucketIndex = hashFunction(key);
        int dataIndex = searchinLL(key, bucketIndex);
        if (dataIndex == -1) {
            // New Node
            bucket[bucketIndex].add(new Node(key, value));
            n++;
        } else {
            // Update exisiting node
            Node data = bucket[bucketIndex].get(dataIndex);
            data.value = value;
        }

        double lambda = (double) n / N;
        if (lambda > 2.0) {
            // Rehashing
            rehash();
        }
    }

    public V remove(K key) {
        int bucketIndex = hashFunction(key);
        int dataIndex = searchinLL(key, bucketIndex);
        if (dataIndex == -1) {
            // New Node
            return null;
        } else {
            // Update exisiting node
            Node data = bucket[bucketIndex].remove(dataIndex);
            n--;
            return data.value;
        }
    }

    public V get(K key) {
        int bucketIndex = hashFunction(key);
        int dataIndex = searchinLL(key, bucketIndex);
        if (dataIndex == -1) {
            // New Node
            return null;
        } else {
            // Update exisiting node
            Node data = bucket[bucketIndex].get(dataIndex);
            return data.value;
        }
    }

    public boolean containsKey(K key) {
        // Fuction to check whether a key is in map or not
        int bucketIndex = hashFunction(key);
        int dataIndex = searchinLL(key, bucketIndex);
        if (dataIndex == -1) {
            // New Node
            return false;
        } else {
            // Update exisiting node
            return true;
        }
    }

    public ArrayList<K> keySet() {
        // Return all keys 
        ArrayList<K> keys = new ArrayList<>();
        for (int i = 0; i < bucket.length; i++) {
            LinkedList<Node> ll = bucket[i];
            for (int j = 0; j < ll.size(); j++) {
                keys.add(ll.get(j).key);
            }
        }
        return keys;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public void printAllData() {
        // Print all the keys and values of map
        if (isEmpty()) {
            System.out.println("HashMap is empty");
            return;
        }
        ArrayList<K> keys = keySet();
        for (int i = 0; i < keys.size(); i++) {
            System.out.println(keys.get(i) + " : " + get(keys.get(i)));
        }
    }
}

public class HashMapCode {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap();
        Scanner input = new Scanner(System.in);
        boolean isContinue = true;
        while (isContinue) {
            System.out.println("-----------------------");
            System.out.println("1: Insert");
            System.out.println("2: Search");
            System.out.println("3: Delete");
            System.out.println("4: Is contains ");
            System.out.println("5: Print all keys");
            System.out.println("6: Print all data ");
            System.out.println("0: Exit");
            System.out.print("Enter your choice : ");
            int choice = input.nextInt();
            int key;
            String value;
            switch (choice) {
                case 1:
                    System.out.print("Enter Key : ");
                    key = input.nextInt();
                    System.out.print("Enter Value : ");
                    value = input.next();
                    map.put(key, value);
                    break;

                case 2:
                    System.out.print("Enter Key : ");
                    key = input.nextInt();
                    System.out.println(key + " : " + map.get(key));
                    break;

                case 3:
                    System.out.print("Enter Key : ");
                    key = input.nextInt();
                    value = map.remove(key);
                    System.out.println(value + " Deleted");
                    break;

                case 4:
                    System.out.print("Enter Key : ");
                    key = input.nextInt();
                    System.out.println(key + " contains : " + map.containsKey(key));
                    break;

                case 5:
                    System.out.println();
                    ArrayList<Integer> keys = map.keySet();
                    for (int i = 0; i < keys.size(); i++) {
                        System.out.print(keys.get(i) + "  ");
                    }
                    break;

                case 6:
                    map.printAllData();
                    break;

                case 0:
                    isContinue = false;
                    break;

                default:
                    System.out.println("Enter correct option");
                    break;
            }
        }
        input.close();
    }
}
