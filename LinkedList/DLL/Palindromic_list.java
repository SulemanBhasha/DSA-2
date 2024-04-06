public class Palindromic_list {

    static class Node {
        Node prev;
        Node next;
        int data;

        Node(int data) {
            this.next = null;
            this.prev = null;
            this.data = data;
        }

        // printing the linked list
        public static void print(Node head) {
            Node temp = head;
            System.out.print("null-->");
            while (temp != null) {
                System.out.print(temp.data + "<->");
                temp = temp.next;

            }
            System.out.println("null");
        }

        // check for palindrome
        public static boolean palindrome(Node head) {
            if (head == null || head.next == null) {
                return true;
            }
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            while ((head != temp)) {
                if (head.data != temp.data) {
                    return false;
                }
                head = head.next;
                temp = temp.prev;
            }
            return true;

        }

    }

    public static void main(String[] args) throws Exception {
        Node head = new Node(6);
        Node b = new Node(8);
        Node c = new Node(8);
        Node d = new Node(8);
        Node e = new Node(8);
        Node tail = new Node(6);

        head.next = b;
        head.prev = null;
        b.next = c;
        b.prev = head;
        c.next = d;
        c.prev = b;
        d.next = e;
        d.prev = c;
        e.next = tail;
        e.prev = d;
        tail.next = null;
        tail.prev = e;
        head.print(head);
        System.out.println(palindrome(head));

    }

}
