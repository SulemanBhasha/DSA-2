import java.util.Stack;

public class Implement_Queue_using_2_stack {

    static class Queue {
        static Stack<Integer> s1 = new Stack();
        static Stack<Integer> s2 = new Stack();

        // check if stack is empty
        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        // adding element
        public static void add(int data) {
            while (!s1.isEmpty()) {
                s2.add(s1.pop());
            }
            s1.add(data);
            while (!s2.isEmpty()) {
                s1.add(s2.pop());
            }
        }

        // pop the element
        public static int pop() {
            if (s1.isEmpty()) {
                return -1;
            }
            return s1.pop();
        }

        // peek the element
        public static int peek() {
            if (s1.isEmpty()) {
                return -1;
            }
            return s1.peek();
        }

        public static void main(String[] args) {
            Queue q = new Queue();
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);
            q.add(6);
            while (!q.isEmpty()) {
                System.out.println(q.peek());
                q.pop();
            }
        }
    }

}
