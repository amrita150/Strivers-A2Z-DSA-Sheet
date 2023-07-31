
 class Node {
     public int data;
     public Node next;
     public Node prev;



     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.prev = null;
     }

}

public class InsertAtDLL
{
    public static Node constructDLL(int []arr) {
        if(arr==null && arr.length==0){
            return null;
        }
        Node head = new Node(arr[0]);
        Node temp = head;
        for (int i = 1; i < arr.length; i++) {
            temp.next = new Node(arr[i]);
            temp.prev = temp;
            temp = temp.next;
        }
        return head;
    }

    public static void printDoublyLinkedList(Node head) {
        Node temp = head;
        System.out.print("null <-> ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        Node head = InsertAtDLL.constructDLL(arr);

        // Print the doubly linked list
        printDoublyLinkedList(head);
    }
}