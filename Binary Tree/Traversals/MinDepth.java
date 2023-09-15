public class MinDepth {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static int idx = -1;
    public static Node buildTree(int node[]){
        idx++;
        if(idx >= node.length || node[idx]==-1){
            return null;
        }

        Node newNode = new Node(node[idx]);
        newNode.left = buildTree(node);
        newNode.right = buildTree(node);

        return newNode;
    }

    public static int minDepth(Node root)
	{
	    if(root==null){
            return 0;
        }
        
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if(left==0 || right==0){
         return Math.max(left,right) + 1;
        }
        
        return Math.min(left,right)+1;
	}

    public static void main(String[] args) {
        int data[] ={1,2,4,-1,-1,5,6,-1,6,-1,7,-1,-1,3};
        MinDepth tree = new MinDepth();
        Node root = tree.buildTree(data);
        int height = tree.minDepth(root);
        System.out.print(height);
    }
}
