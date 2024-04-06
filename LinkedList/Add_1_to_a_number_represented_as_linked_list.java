public class Add_1_to_a_number_represented_as_linked_list {

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

    // reverse a LinkedList
    public static Node reverse() {
        if (head == null || head.next == null) {
            return head;
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
        return head;
    }

    // method to add 1 to list
    public static void addone() {
        head = reverse();
        Node curr = head;
        while (curr != null) {
            if (curr.next == null && curr.data == 9) {
                curr.data = 1;
                Node temp = new Node(0);
                temp.next = head;
                head = temp;
                curr = curr.next;

            } else if (curr.data == 9) {
                curr.data = 0;
                curr = curr.next;
            } else {
                curr.data = curr.data + 1;
                break;
            }

        }
        head = reverse();

    }

    public static void main(String[] args) {
        Add_1_to_a_number_represented_as_linked_list list = new Add_1_to_a_number_represented_as_linked_list();
        list.addFirst(9);

        list.addFirst(9);
        list.addLast(9);

        System.out.println(list.size);
        list.print();
        list.addone();
        list.print();

    }

}
