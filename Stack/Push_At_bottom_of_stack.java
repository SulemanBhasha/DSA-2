import java.util.Stack;

public class Push_At_bottom_of_stack {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        pushAtbottom(1, s);
        System.out.println(s);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }

    }

    private static void pushAtbottom(int data, Stack<Integer> s) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtbottom(data, s);
        s.push(top);
        return;
    }

}
