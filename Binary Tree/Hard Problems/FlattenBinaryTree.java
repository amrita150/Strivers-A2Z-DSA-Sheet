import java.util.Stack;

public class FlattenBinaryTree {

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
    //using recursion
    public static TreeNode prev = null;
    public static void flatten(TreeNode root) {
        if(root==null){
            return;
        }
        flatten(root.right);
        flatten(root.left);

        root.right = prev;
        root.left = null;
        prev = root;
    }

    //using stack
    public void flatten1(TreeNode root) {
        if(root==null){
            return;
        }
        Stack<TreeNode> st = new Stack<>();
        TreeNode curr = root;
        st.push(curr);
        while(!st.isEmpty()){
            curr = st.pop();
            if(curr.right!=null){
                st.push(curr.right);
            }
            if(curr.left!=null){
                st.push(curr.left);
            }

            if(!st.isEmpty()){
            curr.right = st.peek();
            }
            curr.left = null;
            
        }

    }

    //using morris traversal
    public void flatten2(TreeNode root) {
        if(root==null){
            return;
        }
        TreeNode curr = root;
        while(curr!=null){
            if(curr.left!=null){
                //find predecessor
                TreeNode pred = curr.left;
                while(pred.right!=null){
                    pred = pred.right;
                } 

                pred.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }
            curr = curr.right;
        }
    }
    
    public static void main(String[] args) {        
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(6);

        // Flatten the binary tree
        flatten(root);

        TreeNode current = root;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.right;
        }
        System.out.println("null");
    }
}


