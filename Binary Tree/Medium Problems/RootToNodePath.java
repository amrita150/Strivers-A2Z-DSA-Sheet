import java.util.*;
public class RootToNodePath {
        static class TreeNode {
            int data;
            TreeNode left;
            TreeNode right;
    
           
            TreeNode(int data) {
                this.data = data;
                this.left = null;
                this.right = null;
            }
        }

        public static ArrayList<Integer> getPath(TreeNode root, int x){
            ArrayList<Integer> arr = new ArrayList<>();
            if(path(root, arr, x)){
                return arr;
            }

            return new ArrayList<>(); // return empty arraylist
        }

        public static boolean path(TreeNode root, ArrayList<Integer> path, int x){
            if(root==null){
                return false;
            }

            path.add(root.data);
            if(root.data==x){
                return true;
            }

            if(path(root.left, path, x) || path(root.right, path, x)){
                return true;
            }

            path.remove(path.size() - 1);
            return false;
        }
    
        public static void main(String[] args) {
            TreeNode root = new TreeNode(1);
            root.left = new TreeNode(2);
            root.left.left = new TreeNode(4);
            root.left.right = new TreeNode(5);
            root.left.right.left = new TreeNode(6);
            root.left.right.right = new TreeNode(7);
            root.right = new TreeNode(3);
            int target = 7;
            ArrayList<Integer> path = getPath(root, target);
    
            if (!path.isEmpty()) {
                System.out.print("The path to " + target + " is: ");
                for (int it : path) {
                    System.out.print(it + " ");
                }
            } else {
                System.out.println("No path to " + target + " found.");
            }    
        }    
}
