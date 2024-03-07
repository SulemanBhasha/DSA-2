import java.util.ArrayList;
import java.util.List;

public class Print_all_subsequences_of_a_string {

    public static void main(String[] args) {
        String str = "abc";
        int n = str.length();
        List<String> list = new ArrayList<String>();
        String sub = "";
        SubSeq(str, sub, 0, n, list);
        System.out.println(list);

    }

    private static void SubSeq(String str, String sub, int i, int n, List<String> list) {

        if (i == n) {
            list.add(sub);
            return;

        }
        SubSeq(str, sub + str.charAt(i), i + 1, n, list);
        SubSeq(str, sub, i + 1, n, list);

    }

}
