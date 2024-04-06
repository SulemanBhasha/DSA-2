public class Creation_of_doubly_linked_list {

    static class Node {
        Node prev;
        Node next;
        int data;

        Node(int data) {
            this.next = null;
            this.prev = null;
            this.data = data;
        }

        public static void print(Node head) {
            Node temp = head;
            System.out.print("null-->");
            while (temp != null) {
                System.out.print(temp.data + "<->");
                temp = temp.next;

            }
            System.out.println("null");
        }

        // print when tail node is given
        public static void printTail(Node tail) {
            if (tail == null) {
                System.out.println("null");
                return;
            }
            // itarating till head
            Node temp = tail;
            while (temp.prev != null) {
                temp = temp.prev;
            }
            // printing from head
            System.out.print("null-->");
            while (temp != null) {
                System.out.print(temp.data + "<->");
                temp = temp.next;

            }
            System.out.println("null");
            return;
        }

        public void randomNode(Node node) {
            if (node == null) {
                System.out.println("null");
                return;
            }
            Node temp = node;
            while (temp.prev != null) {
                temp = temp.prev;
            }
            System.out.print("null-->");
            while (temp != null) {
                System.out.print(temp.data + "-->");
                temp = temp.next;
            }
            System.out.println("null");
        }

        // method to insert node at head
        public static Node insertAtHead(int data, Node head) {

            Node node = new Node(data);
            node.next = head;
            head.prev = node;
            head = node;
            return head;
        }

        public static Node insertAtTail(Node head, int data) {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            Node node = new Node(data);
            temp.next = node;
            node.prev = temp;
            temp = node;
            return temp;

        }

        public static Node insetAtIndex(Node head, int index, int data) {
            Node node = new Node(data);
            Node temp = head;
            int i = 1;
            while (i < index) {
                temp = temp.next;
                i++;
            }
            temp.next.prev = node;
            node.prev = temp;
            node.next = temp.next;
            temp.next = node;
            return head;

        }

        // remove the link between given index
        public static Node remove(Node head, int index) {
            int i = 1;
            Node temp = head;
            while (i < index) {
                i++;
                temp = temp.next;
            }

            temp.next = temp.next.next;
            temp.next.prev = temp;
            return head;

        }
    }

    public static void main(String[] args) throws Exception {
        Node head = new Node(6);
        Node b = new Node(5);
        Node c = new Node(4);
        Node d = new Node(3);
        Node e = new Node(2);
        Node tail = new Node(1);

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
        head.printTail(tail);
        head.randomNode(c);
        head = head.insertAtHead(10, head);
        head.print(head);
        tail = head.insertAtTail(head, 30);
        head.print(head);
        head = head.insetAtIndex(head, 3, 50);
        head.print(head);
        head = head.remove(head, 3);
        head.print(head);

    }

}
