public class  RemoveNthNode{
    static class Node {
        public int data;
        public Node next;
   
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public static void remove(Node head , int n ){
        int size = 0;
        Node current = head;
        while (current != null){
            current = current.next;
            size++;        
        }
        if(n==size){
            head = head.next;
            return;
        }
        int i = 1;
        Node prev = head;
        int toFind = size - n;
        if(i<toFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
    }

    //we can also do this using slow-fast approach
    public static int findKth(Node head , int k){
        Node slow = head;
        Node fast = head;

        for (int i = 0; i < k; i++) {
            if(fast== null){
                return -1;  //k is greater than the length of the linked list
            }
            fast = fast.next;
        }

        while(fast!=null){
            fast = fast.next;
            slow = slow.next;
        }

        return slow.data;
    }

    public static void printLinked(Node startNode) {
        Node current = startNode;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        int n = 3;
        printLinked(head);
        System.out.println(findKth(head, n)); 
        remove(head , n );
        printLinked(head);    
    }
}