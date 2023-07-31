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

public class InsertEnd {
    public static Node insertAtTail(Node list, int K) {
        Node newNode = new Node(K);
        if (list == null) {
            return newNode;
        }
        Node temp = list;
        while (temp.next != null) {
            temp = temp.next;
        }
        newNode.prev = temp;
        temp.next = newNode;
        newNode.next = null;

        return list;
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
        Node head=null;
        head = insertAtTail(head,1);
        head = insertAtTail(head,5);
        head = insertAtTail(head,3);
        head = insertAtTail(head,4);
        head = insertAtTail(head,8);
        printList(head);
    }
}
