import java.util.LinkedList;
import java.util.List;

public class Longest_subString_without_reapating_character {
    public static void main(String[] args) {
        String str ="aaaabcdefa";
		int s=0;
		int e= 0		;
		int max=0;
		List<Character> l= new LinkedList<Character>();
			while(e<str.length()){
				if(!l.contains(str.charAt(e))){
					l.add(str.charAt(e)) ;
					e++;
					max= Math.max(max, l.size());
					
				}
				else{
					l.remove(Character.valueOf(str.charAt(s)));
					s++;
				}
			}
			System.out.println(max); 
    }
}
