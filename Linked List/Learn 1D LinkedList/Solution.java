public class Solution {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node constructLL(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        Node head = new Node(arr[0]);
        Node temp = head;
        for (int i = 1; i < arr.length; i++) {
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Solution solution = new Solution(); // Create an instance of Solution
        int arr[] = {3, 5, 6, 7, 8};
        Node head = solution.constructLL(arr);
        // Print the linked list values
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
