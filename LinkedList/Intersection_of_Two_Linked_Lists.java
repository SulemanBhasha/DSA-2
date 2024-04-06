public class Intersection_of_Two_Linked_Lists {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) {
     * val = x;
     * next = null;
     * }
     * }
     */
    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            int lengthA = getListLength(headA);
            int lengthB = getListLength(headB);
            while (lengthB != lengthA) {
                if (lengthB < lengthA) {
                    lengthA--;
                    headA = headA.next;
                } else {
                    lengthB--;
                    headB = headB.next;
                }

            }
            while (headA != headB) {
                headA = headA.next;
                headB = headB.next;
            }
            return headB;
        }

        public static int getListLength(ListNode head) {
            ListNode temp = head;
            int l = 0;
            while (head != null) {
                head = head.next;
                l++;
            }
            return l;
        }
    }
}
