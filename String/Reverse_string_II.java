public class Reverse_string_II {
    
	public static void main(String[] args) {
        //		Given a string s and an integer k,
        //		reverse the first k characters for every 2k characters
        //		counting from the start of the string.
                String str= "abcdefg";
                int k = 2;
                char arr []=str.toCharArray();
                int start = 0;
                int end = str.length();
                while(start<end){
                    int e = Math.min(start+k-1, str.length()-1);
                    reverse(arr,start,e);
                    start= start+2*k;
                }
                System.out.println(new String(arr).toString());
                
            }
            public static void reverse(char arr[],int start,int end){
                while(start<end){
                    char temp = arr[start];
                    arr[start]= arr[end];
                    arr[end] = temp;
                    start++;
                    end--;
                }
            }
        
}
