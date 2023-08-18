class Node {
    int val;
    Node next;
    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class SortListUsingMerge {

    public static Node findMid(Node head){
        if (head == null) {
            return null;
        }
        
        Node slow = head;
        Node fast = head.next;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }

    public static Node mergeSort(Node head){
        if(head == null || head.next == null) {
            return head;
        }

        //find mid
        Node mid = findMid(head);
        Node head1 = mid.next;
        mid.next = null;

        Node leftHalf = mergeSort(head);
        Node rightHalf = mergeSort(head1);
        Node mergeResult = merge(leftHalf , rightHalf);

        return mergeResult;

    }

    public static Node merge(Node left, Node right) {
        Node finalHead = new Node(-1);
        Node temp = finalHead;

        while(left!=null && right!=null){
            if(left.val<=right.val){
                temp.next = left;
                left = left.next;
            }
            else{
                temp.next = right;
                right = right.next;
            }

            temp = temp.next;

        }

        while(left!=null){
            temp.next = left;
            left = left.next;
            temp = temp.next;
        }
        while(right!=null){
            temp.next = right;
            right = right.next;
            temp = temp.next;
        }

        return finalHead.next;
    }

    public static void printLinkedList(Node startNode) {
        Node current = startNode;
        while (current != null) {
            System.out.print(current.val+ " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

        public static void main(String[] args) {
            // Create the linked list
            Node head = new Node(1);
            head.next = new Node(9);
            head.next.next = new Node(2);
            head.next.next.next = new Node(8);
            head.next.next.next.next = new Node(3);
            head.next.next.next.next.next = new Node(7);
            printLinkedList(head);

            Node merge = mergeSort(head);
            printLinkedList(merge);
            
        }
}
