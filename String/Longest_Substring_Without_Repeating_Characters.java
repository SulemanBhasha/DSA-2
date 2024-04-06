import java.util.HashMap;

/**
 * Longest_Substring_Without_Repeating_Characters
 */
public class Longest_Substring_Without_Repeating_Characters {
    
	public static void main(String[] args) {
		String str = "abcdefabcd";
		String max= max(str);
		System.out.println(max);
		
	}

	private static String max(String str) {
		HashMap<Character, Integer> map =new HashMap<Character, Integer>();
		String s= "";
		int i =0;
		int max= 0;
		
		for (int j = 0; j < str.length(); j++) {
			char ch = str.charAt(j);
			if(map.containsKey(ch))
			{
				i = Math.max(i,map.get(ch)+1);
			}
			map.put(ch, j);
			if(max<j-i+1){
				s="";
				int k =i;
				while(k<=j){
					s=s +str.charAt(k++);
				}
			}
			max=Math.max(max, j-i+1);
		}
		return s;
	}

    
    
}