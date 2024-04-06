import java.util.LinkedList;
import java.util.Queue;

public class Reverse_Queue_by_using_Recurssion {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.toString());
        reverse(q);
        System.out.println(q);

    }

    private static void reverse(Queue<Integer> q) {
        if (q.isEmpty()) {
            return;
        }
        int front = q.remove();
        reverse(q);
        q.add(front);

    }

}
