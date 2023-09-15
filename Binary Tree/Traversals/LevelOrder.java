import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class LevelOrder {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> arr = new ArrayList<>();

        if (root == null) {
            return arr;
        }

        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> subLevels = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode curr = q.remove();
                subLevels.add(curr.val);

                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }

            arr.add(subLevels);
        }

        return arr;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> result = levelOrder(root);

        for (List<Integer> level : result) {
            System.out.println(level);
        }

    }
}


