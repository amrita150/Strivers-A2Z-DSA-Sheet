public class SearchInLL {
    public static class Node {
        public int data;
        public Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // public static boolean searchInLinkedList(Node head, int k) {
    //     // Iterative search
    //     Node temp = head;

    //     if (head.data == k) {
    //         return true;
    //     }

    //     while (temp != null) {
    //         if (temp.data == k) {
    //             return true;
    //         }
    //         temp = temp.next;
    //     }
    //     return false;
    // }

    //recursive search
    public static boolean searchInLinkedList(Node head , int key) {
        if(head==null){
           return false;
        }

        if(head.data==key){
            return true;
        }
        return searchInLinkedList(head.next , key);
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

        int key = 5;
        System.out.println(searchInLinkedList(head, key));

    }
}