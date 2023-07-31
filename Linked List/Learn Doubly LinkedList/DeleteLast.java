class Node {
    public int data;
    public Node next;
    public Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DeleteLast {
    public static Node deleteLastNode(Node head) {
        if(head==null || head.next==null){
            return null;
        }

        Node temp = head;
       while (temp.next != null) {
           temp = temp.next;
       }

       temp.prev.next=null;
       return head;
   }
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating a linked list
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next;

        printList(head);
        deleteLastNode(head);
        printList(head);
    }
}
