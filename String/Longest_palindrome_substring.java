/**
 * Longest_palindrome_substring
 */
public class Longest_palindrome_substring {
 public static void main(String[] args) {
    String str = "aaabbbaaa";
    int s =0;
    int e= 0;
    int max=-1;
    for (int i = 0; i < str.length(); i++) {
        int l1= palindrome(str,i,i+1);
        int l2 = palindrome(str,i,i+1);
        max= Math.max(l1, l2);
        if(e-s<max){
            s=i-(max-1)/2;
            e=i+(max)/2;
        }
    }
    System.out.println(str.substring(s, e+1));
 }
 public static int palindrome(String str, int i, int j){
    while(i>=0 && j<str.length() && (str.charAt(i)== str.charAt(j))){
        i--;
        j++;
    }
    return j-i-1;
 }
    
}
