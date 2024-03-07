public class Palindrome_String {
    public static void main(String[] args) {
        String str = "mom";
        System.out.println(isPalindrome(str));
    }
  static  int isPalindrome(String S) {
        int s= 0;
        int e= S.length()-1;
        while(s<e){
            if(S.charAt(s)!=S.charAt(e)){
                return 0;
            }
            s++;
            e--;
        }
        return 1;
    }
}
