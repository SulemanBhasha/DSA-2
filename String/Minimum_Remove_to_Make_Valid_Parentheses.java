public class Minimum_Remove_to_Make_Valid_Parentheses {

    public static void main(String[] args) {
        String str = "lee(t(c)o)de)";
        System.out.println(str);
        str = validString(str);
        System.out.println(str);
    }

    private static String validString(String str) {
        int open = 0;
        StringBuilder sb = new StringBuilder();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                sb.append(ch);
                open++;
            } else if (ch == ')') {
                if (open > 0) {
                    sb.append(ch);
                    open--;
                } else if (open == 0) {
                    continue;
                }

            } else {
                sb.append(ch);
            }
        }
        n = sb.length();
        for (int i = n - 1; i >= 0; i--) {
            if (open == 0) {
                break;

            }
            char ch = sb.charAt(i);
            if (ch == '(') {
                sb.deleteCharAt(i);
                open--;
            }
        }
        return sb.toString();
    }

}
