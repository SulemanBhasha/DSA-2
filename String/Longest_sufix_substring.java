import java.util.Arrays;

public class Longest_sufix_substring {
    public static void main(String[] args) {
        
		String arr[]={"Hell","aall","bbll","ccll","ddll","lll"};
		
		for (int i = 0; i < arr.length; i++) {
		String str= arr[i];
		int s=0;
		int e= str.length()-1;
		String newString = "";
		for (int j = str.length()-1; j>=0; j--) {
			newString+=str.charAt(j);
		}
		arr[i]=newString;
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		StringBuilder result = new StringBuilder();
		char first []= arr[0].toCharArray();
		char last[]= arr[arr.length-1].toCharArray();
		for (int i = 0; i < first.length; i++) {
			if(first[i]!=last[i]){
				break;
			}
			result.append(first[i]);
			
		}
		System.out.println(result);
	
    }
}
