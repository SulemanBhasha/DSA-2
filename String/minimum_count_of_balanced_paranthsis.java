import java.util.Stack;

public class minimum_count_of_balanced_paranthsis {
    
public static void main(String[] args) {
	int count = countRev("{}{{}{{{{{}}{}");
	System.out.println(count);
	
}
public  static int countRev (String s)
{
    // your code here  
    if(s.length()%2==1){
        return -1;
    }
    else{
        Stack<Character > stack = new Stack<Character > ();
        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
        if(ch=='{'){
            stack.push(ch);
    }
    else{
    	if(stack.isEmpty() || stack.peek()=='}'){
    		stack.push(ch);
    	}
    }
        }
    int open =0;
    int close= 0;
   
    while(!stack.isEmpty()){
      if(stack.peek()=='{'){
          open++;
      }   
      else{
          close++;
      }
    }
    return (open/2)+1+(close/2)+1;
 }
}

}
