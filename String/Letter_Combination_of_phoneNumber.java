import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

/**
 * Letter_Combination_of_phoneNumber
 */
public class Letter_Combination_of_phoneNumber {

    public static void main(String[] args) {
        
		HashMap<String, String> map = new HashMap<>();
		map.put("2", "abc");map.put("3", "def");map.put("4", "ghi");
		map.put("5", "jkl");map.put("6", "mno");
		map.put("8", "tuv");map.put("9", "wxyz");
		
		
		String digit ="23";
		if(digit.length()==0){
			System.out.println("not a valid String ");
			return ;
		}
		Deque<String> deque = new ArrayDeque<>();
		deque.add("");
		for (int i = 0; i < digit.length(); i++) {
			String d= digit.substring(i,i+1);
		
			String formap=map.get(d);
			int n =deque.size();
			for (int j = 0; j < n; j++) {
				String pull =deque.pollFirst();
				for (int k = 0; k < formap.length(); k++) {
					String temp = pull.concat(formap.charAt(k)+"");
					deque.add(temp);
				}
				
			}
		}
		
		System.out.println(deque);
	
    }
}