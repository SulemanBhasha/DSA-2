import java.util.Arrays;
import java.util.Stack;

public class Next_greater_element {

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        int nrr[] = new int[5];
        Stack<Integer> s = new Stack();
        for (int i = 4; i >= 0; i--) {
            if (s.isEmpty()) {
                nrr[i] = -1;
                s.push(arr[i]);
                continue;
            }
            if (s.isEmpty())

                if (s.peek() > arr[i]) {
                    nrr[i] = s.peek();
                    s.push(arr[i]);
                    continue;
                }
            while (!s.isEmpty() && s.peek() <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nrr[i] = -1;
            } else {
                nrr[i] = s.peek();
            }
            s.push(arr[i]);

        }
        System.out.println(Arrays.toString(nrr));
    }

}
