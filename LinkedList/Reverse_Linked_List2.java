public class Reverse_Linked_List2 {

    static Node head;
    static int size;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add first , add last
    // add First
    public static void addFirst(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }
        node.next = head;
        head = node;
        return;
    }

    // add last
    public static void addLast(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = node;
        return;
    }

    // print list
    public static void print() {
        if (head == null) {
            System.out.println(-1);
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "-->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
        return;
    }

    // delete first
    public void deleteFirst() {
        if (head == null) {
            System.out.println("lists is empty");
            return;
        }
        head = head.next;
        size--;
        return;
    }

    // delete last
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            size--;
            return;
        }

        Node secondlastNode = head;
        Node LastNode = head.next;
        while (LastNode.next != null) {
            LastNode = LastNode.next;
            secondlastNode = secondlastNode.next;
        }
        secondlastNode.next = null;
        size--;
        return;
    }

    // reverse a LinkedList
    public void reverse() {
        if (head == null || head.next == null) {
            return;
        }
        Node prevNode = head;
        Node currNode = prevNode.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            // update the prev and curr values
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
        return;
    }

    public static void main(String[] args) {
        Reverse_Linked_List2 list = new Reverse_Linked_List2();
        list.addFirst(1);

        list.addFirst(2);
        list.addLast(7);

        System.out.println(list.size);
        // list.print();
        // list.deleteFirst();
        list.print();
        // list.deleteLast();
        // list.print();
        // list.deleteLast();
        System.out.println(list.size);
        // call for revrsing a list
        list.reverse();
        list.print();

    }

}
