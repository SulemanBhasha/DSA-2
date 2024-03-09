import java.util.ArrayList;
import java.util.List;

public class Rabin_Karp_Algorithm_for_Pattern_Searching {
    
	public static void main(String[] args) {
		String str="ababacabab";
		String pattern = "aba";
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i <= str.length()-pattern.length(); i++) {
			if(str.charAt(i)==pattern.charAt(0)){
				String ss= str.substring(i,i+pattern.length()); 
				System.out.println(ss);
				int res = search(ss,pattern,list);
				if(res==1){
					list.add(i);
					
					
				}
				
			}
		}
		System.out.println(list);

	}

	private static int search(String str, String pattern, List<Integer> list) {
		int s= 0;
		int e=pattern.length()-1;
		while(s<=e){
			if(str.charAt(s)!=pattern.charAt(s)){
				return -1;
			}
			s++;
		}
		return 1;
				
		
	}

}
