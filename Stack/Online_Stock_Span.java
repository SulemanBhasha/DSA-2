public class Online_Stock_Span {

    public static void main(String[] args) {
        int arr[] = { 100, 80, 60, 70, 60, 75, 85 };
        int resultArray[] = new int[arr.length];
        resultArray[0] = 1;
        solve(arr, resultArray);
        System.out.println(Arrays.toString(resultArray));
    }

    private static void solve(int[] arr, int resultArray[]) {
        // TODO Auto-generated method stub
        Stack<Integer> st = new Stack();
        st.push(0);
        for (int i = 1; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                resultArray[i] = i + 1;
            } else {
                resultArray[i] = i - st.peek();
            }
            st.push(i);
        }

    }

}
