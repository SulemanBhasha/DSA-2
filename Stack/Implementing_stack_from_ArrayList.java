import java.util.ArrayList;

public class Implementing_stack_from_ArrayList {

    static class Node {
        Node next;
        int data;

        Node(int data) {
            this.next = null;
            this.data = data;
        }

        static class Stack {
            static ArrayList<Integer> list = new ArrayList<>();

            public static boolean isEmpty() {
                return list.size() == 0;
            }

            // push
            public static void push(int data) {
                list.add(data);
                return;
            }

            // pop
            public static int pop() {
                if (isEmpty()) {
                    return -1;
                }
                int top = list.get(list.size() - 1);
                list.remove(list.size() - 1);
                return top;
            }

            // peek
            public static int peek() {
                if (isEmpty()) {
                    return -1;
                }
                return list.get(list.size() - 1);
            }

        }

        public static void main(String[] args) {
            Stack s = new Stack();
            s.push(1);
            s.push(2);
            s.push(3);
            s.push(4);
            while (!s.isEmpty()) {
                System.out.println(s.pop());
            }
        }
    }

}
