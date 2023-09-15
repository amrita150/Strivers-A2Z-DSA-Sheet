class Node {
    public int data;
    public Node left;
    public Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class CreateTree {

    public static Node createTree(int[] arr) {
        return tree(arr, 0);
    }

    public static Node tree(int arr[], int i) {
        if (i >= arr.length) {
            return null;
        }

        int element = arr[i];
        Node root = new Node(element);
        root.left = tree(arr, 2 * i + 1);
        root.right = tree(arr, 2 * i + 2);

        return root;
    }

    public static void main(String[] args) {
        // Example input array
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        // Create the binary tree
        Node root = createTree(arr);

        System.out.println(root.data);
    }
}
