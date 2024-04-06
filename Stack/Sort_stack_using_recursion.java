public abstract class Sort_stack_using_recursion {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s);
        s = sort(s);
        System.out.println(s);

    }

    public static Stack<Integer> sort(Stack<Integer> s) {
        reverse(s);
        return s;
    }

    public static void reverse(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverse(s);
        position(s, top);
    }

    public static void position(Stack<Integer> s, int top) {
        if (s.isEmpty() || s.peek() < top) {
            s.push(top);
        } else {
            int a = s.pop();
            position(s, top);
            s.push(a);
        }
    }

}
