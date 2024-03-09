public class Convert_sentence_into_its_equivalent_mobile_numeric_keypad_sequence {
    
	public static void main(String[] args) {
		String str[]
	            = { "2",    "22",  "222", "3",   "33", "333",
	                "4",    "44",  "444", "5",   "55", "555",
	                "6",    "66",  "666", "7",   "77", "777",
	                "7777", "8",   "88",  "888", "9",  "99",
	                "999",  "9999" };
		String input= "GEEKSFORGEEKS";
	String newString = print(str,input);
	System.out.println(newString);
	}

	private static String print(String[] str, String input) {
		String newString= "";
		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i)==' '){
				newString = newString + " ";
			}
			else{
				int  ch= input.charAt(i)-'A';
				System.out.println(ch);
				newString = newString + str[ch];
			}
		}
		return newString;
	}

}
