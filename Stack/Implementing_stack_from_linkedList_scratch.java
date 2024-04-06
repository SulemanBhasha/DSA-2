public class Implementing_stack_from_linkedList_scratch {

    static class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        static Node head;

        // isEmprty() function
        public static boolean isEmpty() {
            return (head == null);
        }

        // push() function
        public void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
            return;
        }

        // pop() function
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int pop = head.data;
            head = head.next;
            return pop;
        }

        // peek function
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }

        // print() function
        public static void print() {
            if (isEmpty()) {
                System.out.println("null");
                return;
            }
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }

            return;
        }

    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.print();
        // while(!s.isEmpty()){
        // System.out.println(s.pop());
        //
        // }
    }

}
