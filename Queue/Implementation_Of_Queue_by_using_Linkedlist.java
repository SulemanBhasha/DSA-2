public class Implementation_Of_Queue_by_using_Linkedlist {

    static class Queue {
        static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        static Node head = null;
        static Node tail = null;

        // adding element in front
        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        public static void add(int data) {
            Node newNode = new Node(data);
            if (tail == null) {
                tail = head = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
            return;
        }

        // remooving element in front and moove haed
        public static int pop() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int front = head.data;
            if (head == tail) {
                tail = null;
            }
            head = head.next;
            return front;
        }

        // fetching peek element
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(1);
        q.add(10);
        q.add(2);
        q.add(3);
        q.add(4);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.pop();
        }
    }

}
