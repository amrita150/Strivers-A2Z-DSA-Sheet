public class DeleteLastNode {

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

    public static Node deleteLast(Node list){
        if(list==null && list.next==null){
            return list;
        }
        Node temp = list;
        while(temp.next != null && temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;

        return list;
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
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.println("Original Linked List:");
        printLinkedList(head);

        head = deleteLast(head);

        // Printing the updated linked list
        System.out.println("\nLinked List");
        printLinkedList(head);
    }

  
}