public class BalancedTreeCheck {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

       
        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    //naive approach O(n*n) time complexity
    public static int height(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftT = height(root.left);
        int rightT = height(root.right);

        return Math.max(leftT, rightT) + 1;
    }

    public static boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }

        // Check if both left and right subtrees are balanced
        return isBalanced(root.left) && isBalanced(root.right);
    }

    // time complexity O(n)
    public static int isBalancedOptimized(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = isBalancedOptimized(root.left);
        if(leftHeight == -1){
            return -1;
        }
        int rightHeight = isBalancedOptimized(root.right);
        if(rightHeight==-1){
            return -1;
        }
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        } else{
            return Math.max(leftHeight , rightHeight) + 1 ;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.left.left.right = new TreeNode(4);

        if(isBalancedOptimized(root)< 0){
            System.out.println("false");
        }else{
            System.out.println("true");
        }
    }
}
