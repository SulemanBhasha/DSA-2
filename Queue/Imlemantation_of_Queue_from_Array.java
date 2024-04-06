/**
 * Imlemantation_of_Queue_from_Array
 */
public class Imlemantation_of_Queue_from_Array {

    static class Queue {
        static int size;
        static int arr[];
        static int rear = -1;

        Queue(int n) {
            arr = new int[n];
            this.size = n;

        }

        // check Q i empty or not
        public static boolean isEmpty() {
            return rear == -1;
        }

        // adding element
        public static void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear] = data;

        }

        // remove value at front
        public static int remove() {
            if (isEmpty()) {
                System.out.println("quue is empty");
                return -1;
            }
            int front = arr[0];

            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        // fetxch the front value
        public static int peek() {
            if (isEmpty()) {
                System.out.println("statck is empty");
                return -1;
            }

            return arr[0];
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }

}