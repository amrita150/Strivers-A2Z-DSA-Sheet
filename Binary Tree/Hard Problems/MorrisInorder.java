import java.util.ArrayList;
import java.util.List;

/**
 * MorrisInorder
 */
public class MorrisInorder {
  static class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
  }
    public static List<Integer> morrisInOrderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        TreeNode curr = root;

        while (curr != null) {
            if (curr.left == null) {
                list.add(curr.data);
                curr = curr.right;
            } else {
                // Find the inorder predecessor of the current node (the rightmost node in the left subtree)
                TreeNode pred = curr.left;
                while (pred.right != null && pred.right != curr) {
                    pred = pred.right;
                }

                if (pred.right == null) {
                    // Create a threaded link from predecessor to the current node
                    pred.right = curr;
                    curr = curr.left;
                } else {
                    // Remove the threaded link and add the current node to the result
                    pred.right = null;
                    list.add(curr.data);
                    curr = curr.right;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        // Create a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(6);        
        root.left.left = new TreeNode(5);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(9);        
        root.right.left.right = new TreeNode(7);

        // Get and print the Morris Inorder Traversal of the tree
        List<Integer> morrisInOrderTraversal = morrisInOrderTraversal(root);
        System.out.println("Morris In-order Traversal: " + morrisInOrderTraversal);
    }
}
