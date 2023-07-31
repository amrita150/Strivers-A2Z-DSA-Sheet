public class LengthOfLL {
    public static class Node {
        public int data;
        public Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static int length(Node head) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        return size;
    }

    public static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(4);
        head.next = new Node(5);
        head.next.next = new Node(1);
        head.next.next.next = new Node(9);

        printLinkedList(head);

        System.out.println("Length of LL is " + length(head));

    }
}
