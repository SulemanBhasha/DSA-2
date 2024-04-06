import java.util.ArrayList;
import java.util.List;

public class Permutation_of_String {

    public static void main(String[] args) {
        List<String> list = new ArrayList();

        list = find_permutation("ABCD");
        System.out.println(list);

    }

    public static List<String> find_permutation(String S) {
        char ch[] = S.toCharArray();
        List<String> list = new ArrayList<String>();
        permut(ch, list, 0);
        return list;
    }

    public static void permut(char ch[], List<String> list, int index) {
        if (index >= ch.length) {
            String str = rev(ch);
            list.add(str);
            return;
        }
        for (int i = index; i < ch.length; i++) {
            swap(ch, i, index);
            permut(ch, list, index + 1);
            swap(ch, index, i);
        }
    }

    public static void swap(char ch[], int index, int i) {
        char temp = ch[i];
        ch[i] = ch[index];
        ch[index] = temp;

    }

    public static String rev(char ch[]) {
        String str = "";
        for (int i = 0; i < ch.length; i++) {
            str = str + ch[i];
        }
        return str;
    }

}
