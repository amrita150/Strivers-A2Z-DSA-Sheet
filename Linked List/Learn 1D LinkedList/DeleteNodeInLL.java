class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
    }
}

public class DeleteNodeInLL {

    public static void deleteNode(ListNode node) {
        if (node == null || node.next == null) {
            // Cannot delete the last node or a null node
            return;
        }

        ListNode nextNode = node.next;
        // Copy the value of the next node to the given node
        node.data = nextNode.data;
        // Update the "next" pointer of the given node to skip the next node
        node.next = nextNode.next;
    }

    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);

        ListNode nodeToDelete = head.next;

        printLinkedList(head);

        deleteNode(nodeToDelete);

        printLinkedList(head);
    }
}
