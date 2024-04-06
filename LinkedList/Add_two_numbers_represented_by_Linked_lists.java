public class Add_two_numbers_represented_by_Linked_lists {

    /*
     * node for linked list
     * 
     * class Node {
     * int data;
     * Node next;
     * 
     * Node(int d) {
     * data = d;
     * next = null;
     * }
     * }
     * 
     */

    class Solution {
        // Function to add two numbers represented by linked list.
        static Node addTwoLists(Node num1, Node num2) {
            num1 = reverse(num1);
            num2 = reverse(num2);

            Node curr = null;
            Node res = null;
            int c = 0;
            int s = 0;
            Node temp;

            while (num1 != null || num2 != null) {
                s = c + (num1 != null ? num1.data : 0) + (num2 != null ? num2.data : 0);
                c = (s >= 10) ? 1 : 0;
                s = s % 10;
                temp = new Node(s);
                if (res == null) {
                    res = temp;
                } else {
                    curr.next = temp;
                }
                curr = temp;
                if (num1 != null)
                    num1 = num1.next;
                if (num2 != null)
                    num2 = num2.next;
            }
            if (c > 0) {
                temp = new Node(c);
                curr.next = temp;
                curr = temp;
            }
            res = reverse(res);
            return res;

        }

        public static Node reverse(Node head) {
            Node prev = null;
            Node next = null;
            Node curr = head;
            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            return prev;
        }

    }
}
