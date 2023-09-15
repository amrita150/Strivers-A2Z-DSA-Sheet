public class NumberOfNodes {

    public static int numberOfNodes(int N){
    int c=1;
    for(int i =0;i<N-1;i++)
    c*=2;
    return c;
    }

    public static void main(String[] args){
        //no. of leaf nodes in a perfect binary tree
     System.out.println(numberOfNodes(4)); 
    }
}