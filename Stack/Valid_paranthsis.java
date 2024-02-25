import java.util.Stack;

/**
 * Valid_paranthsis
 */
public class Valid_paranthsis {
    public static void main(String[] args) {
        
        String str= "({{}})";
        Stack<Character> s = new Stack<>();
        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch=='(' || ch =='{' || ch == '['){
                s.push(ch);
            }    
            else{
                if(s.isEmpty()){
                    System.out.println("not a valid String");
                    flag=false;
                    break;
                    
                }
                else if(   (s.peek()=='(' && ch ==')') || (    s.peek()=='{' && ch =='}') || (  s.peek()=='[' && ch ==']')   ){
                    s.pop();
                }
                else{
                    System.out.println("not a valid String");
                    flag=false;
                    break;
                    
                }
            }
          
        }
        if(!s.isEmpty() || flag== false){
            System.out.println("not a  valid String");
        }
        else{
            System.out.println("valid");
        }
    
    }
}