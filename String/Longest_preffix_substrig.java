import java.util.Arrays;

/**
 * Longest_preffix_substrig
 */
public class Longest_preffix_substrig {

    public static void main(String[] args) {
        
		String arr[]={"Hell","aall","bbll","ccll","ddll","l"};
		Arrays.sort(arr);
		char f[]=arr[0].toCharArray();
		char l[]=arr[arr.length-1].toCharArray();
		Arrays.sort(f);
		Arrays.sort(l);
		int fl=f.length-1;
		int ll= l.length-1;
		StringBuilder result = new StringBuilder();
		int min =Math.min(f.length,l.length);
		for (int i = 0; i <min ;i++) {
			if(f[fl]!=l[ll]){
				break;
			}
			result.append(l[ll]);
			ll--;
			fl--;
			
		}
		System.out.println(result);
	
    }
}
