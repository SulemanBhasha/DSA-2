import java.util.ArrayList;
import java.util.List;

public class Two_Sum_in_a_DLL {

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

        // implimenting two sum
        public static List<Integer> TwoSum(Node head, int sum) {
            List<Integer> list = new ArrayList<Integer>();
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            while (head != temp) {
                if ((head.data + temp.data) == sum) {
                    list.add(head.data);
                    list.add(temp.data);
                    return list;
                }
                if ((head.data + temp.data) > sum) {
                    temp = temp.prev;
                } else {
                    head = head.next;
                }
            }
            return list;

        }

    }

    public static void main(String[] args) throws Exception {
        Node head = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node tail = new Node(10);

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
        Node.print(head);

        System.out.println(Node.TwoSum(head, 13));

    }

}
