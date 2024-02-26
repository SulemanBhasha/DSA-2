/**
 * Find_the_Index_of_the_First_Occurrence_in_a_String
 */
public class Find_the_Index_of_the_First_Occurrence_in_a_String {

    public static void main(String[] args) {
        String str= "ccleet";
		String needle= "leet";
		int result= methodCalling(str,needle);
        System.out.println(result);
    }
    public static int methodCalling(String str,String needle){
        for (int i = 0; i < str.length()-needle.length()+1; i++) {
            if(str.charAt(i)==needle.charAt(0)){
                if(compare(str,needle,i)){
                    return i;
                }
            }
        }
        return -1;
    }
    public static boolean compare(String str , String needle ,int i){
        int k=0;
        for (int j = i; j < needle.length(); j++) {
            if(str.charAt(j)!=needle.charAt(k++)){
                return false;
            }
        }
        return true;
    }

}
