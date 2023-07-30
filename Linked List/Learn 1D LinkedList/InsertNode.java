public class InsertNode
{
    static class Node {
        public int data;
        public Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }

        public static Node head;
        public static Node tail;
        
    }

    //inserting the value at first
    public static Node insertAtFirst(Node head, int newValue) {
        Node newNode = new Node(newValue);
        newNode.next = head;
        head = newNode;

        return head;
    }

    //printing the linkedlist
    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Creating a linked list with three nodes: 1 -> 2 -> 3
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        // Printing the initial linked list
        System.out.println("Original Linked List:");
        printLinkedList(head);

        // Inserting a new node with value 10 at the beginning
        head = insertAtFirst(head, 10);

        // Printing the updated linked list
        System.out.println("\nLinked List after inserting at first:");
        printLinkedList(head);
    }

}