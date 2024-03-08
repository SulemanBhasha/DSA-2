/**
 * Split_the_binary_string_into_substrings_with_equal_number_of_0s_and_1s
 */
public class Split_the_binary_string_into_substrings_with_equal_number_of_0s_and_1s {

    public static void main(String[] args) {
		String str ="0100110101";
		int count0=0;
		int count1= 0;
		int count =0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)=='0'){
				count0++;
			}
			else{
				count1++;
			}
			if(count1==count0){
				count++;
				count1=0;
				count0=0;
			}
		}
		System.out.println(count);
	}

    
}