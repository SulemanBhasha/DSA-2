import java.util.Arrays;

/**
 * Longest_prefix_in_string
 */
public class Longest_prefix_in_string {
     public static void main(String[] args) {
        String str[]={"clue","cluth","cluas","cluase"};
        Arrays.sort(str);
        StringBuilder result = new StringBuilder();
        char first[]=str[0].toCharArray();
        char last[]= str[str.length-1].toCharArray();
        for (int i = 0; i < first.length; i++) {
            if(first[i]!=last[i]){
                break;
            }
            else{
                result.append(first[i]);
            }

        }
        System.out.println(result);
     }
    
}