import java.util.Stack;

/**
 * Valid_paranthasis
 */
public class Valid_paranthasis {

    public static void main(String[] args) {
        String str = "({{[]}})";
        Stack<Character> s = new Stack<>();
        for (Character ch : str.toArray()) {
            if( ch =='(')
              s.push(')');
              else if(ch =='{')
              s.push('}');
              else if (ch=='[') {
                s.push(']');
              }
              else if(s.isEmpty() || s.pop()!=ch)
              {
                System.out.println("not a valid sring");
              }
        }
        if (!s.isEmpty()) {
            System.out.println("not a vali string");
        }
        else{
            System.out.println("true");
        }
    }
}