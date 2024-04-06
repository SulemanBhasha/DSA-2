public class Program_to_Move_the_last_element_to_Front_in_a_Linked_List {

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

    public static void mooveFront() {
        if (head == null || head.next == null) {
            return;
        }
        Node prev = head;
        Node curr = head.next;
        while (curr.next != null) {
            prev = curr;
            curr = curr.next;
        }
        prev.next = null;
        curr.next = head;
        head = curr;
        return;
    }

    public static void main(String[] args) {
        Program_to_Move_the_last_element_to_Front_in_a_Linked_List list = new Program_to_Move_the_last_element_to_Front_in_a_Linked_List();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        System.out.println(list.size);
        list.print();
        list.mooveFront();
        list.print();

    }

}
