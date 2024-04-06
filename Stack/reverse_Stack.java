import java.util.Stack;

public class reverse_Stack {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        reverse(s);
        System.out.println(s);
    }

    private static void reverse(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverse(s);
        pushAtbottom(top, s);
    }

    public static void pushAtbottom(int data, Stack<Integer> s) {
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
